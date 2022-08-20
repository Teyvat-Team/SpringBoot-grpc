package com.localserver.grpc;

import cn.hutool.core.date.DateTime;
import com.localserver.clickhouse.model.po.SchemaTable;
import com.localserver.clickhouse.service.ISchemaService;
import com.localserver.mysql.model.po.DataModel;
import com.localserver.mysql.model.po.DataSet;
import com.localserver.mysql.service.IDataModelService;
import com.localserver.mysql.service.IDatasetService;
import com.localserver.mysql.service.impl.DataSetServiceImpl;
import com.wr.grpc.lib.BaseResp;
import com.wr.grpc.lib.dataset.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 王瑞
 * @date 2022/8/17
 */
@GrpcService
public class DataSetService extends DataSetServiceGrpc.DataSetServiceImplBase {

    @Autowired
    IDatasetService datasetservice;

    @Autowired
    IDataModelService dataModelService;

    @Autowired
    ISchemaService schemaService;
    @Autowired
    DataSetServiceImpl dataSetServiceImpl;

    /**
     * 数据集列表
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void list(DataSetListRequest request, StreamObserver<DataSetListResponse> responseObserver) {
        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("success");

        Map<String, Object> params = new HashMap<>();
        params.put("createUser", request.getCreateUser());
        params.put("orderBy", request.getOrderBy());
        params.put("order", request.getOrder());
        params.put("page", request.getPage());
        params.put("pageSize", request.getPageSize());
        params.put("keyword", request.getKeyword());
        System.out.println(params+"-----------------------------");
        List<DataSet> datasets = datasetservice.listDataset(params);
        DataSetListResponse.Builder dataSetListResponseBuilder = DataSetListResponse.newBuilder();
        for (int i = 0; i < datasets.size(); i++) {
            DataSetListResponseData.Builder dataSetListResponseDataBulider = DataSetListResponseData.newBuilder();
            Integer datasetId = datasets.get(i).getId();
            List<String> table_names = datasetservice.listTableByDatasetId(datasetId);
            dataSetListResponseDataBulider.setTotalCount(table_names.size());
            for (int j = 0; j < table_names.size(); j++) {
                String tableName = table_names.get(j);
                List<SchemaTable> schemas = schemaService.selectSchema(tableName);

                DataSetList.Builder dataSetListBuilder = DataSetList.newBuilder();
                dataSetListBuilder.setCreateTime(String.valueOf(datasets.get(i).getCreateTime()));
                dataSetListBuilder.setName(datasets.get(i).getDbName());
                dataSetListBuilder.setDescr(datasets.get(i).getDataDescr());
                dataSetListBuilder.setDataSourceType(datasets.get(i).getDataSourceType());
                dataSetListBuilder.setId(String.valueOf(datasets.get(i).getId()));
                dataSetListBuilder.setCreateUser(datasets.get(i).getCreateUser());
                dataSetListBuilder.setDbName(schemas.get(0).getDatabase());
                dataSetListBuilder.setTableName(tableName);
                dataSetListBuilder.setTableId(tableName);

                for (int k = 0; k < schemas.size(); k++) {
                    Schema.Builder sch = Schema.newBuilder();
                    sch.setName(schemas.get(k).getName());
                    sch.setType(schemas.get(k).getType());
                    sch.setDescr(schemas.get(k).getComment());
                    sch.setIsPartition(false);

                    dataSetListBuilder.addSchema(sch);
                }
                dataSetListResponseDataBulider.addDataSetList(dataSetListBuilder);
            }
            dataSetListResponseBuilder.addData(dataSetListResponseDataBulider);
        }

        dataSetListResponseBuilder.setBaseResp(baseResp);
        responseObserver.onNext(dataSetListResponseBuilder.build());
        responseObserver.onCompleted();

    }

    /***
     * 创建数据集
     * @param request
     * @param responseObserver
     */
    @Transactional
    @Override
    public void create(CreateDatasetRequest request, StreamObserver<CreateDatasetResponse> responseObserver) {
        DataSet dataset = new DataSet();

        dataset.setDataName(request.getCreateTableList(0).getName());
        dataset.setDataDescr(request.getCreateTableList(0).getDescr());
        dataset.setDataSourceType(request.getCreateTableList(0).getDataSourceName());
        dataset.setDbName(request.getCreateTableList(0).getDbName());
        dataset.setCreateTime(String.valueOf(new Timestamp(new DateTime().getTime())));
        dataset.setCreateUser(request.getCreateTableList(0).getCreateUser());
        Integer dataset_id = datasetservice.insertDataset(dataset);

        for (int i = 0; i < request.getCreateTableListCount(); i++) {
            for (int j = 0; j < request.getCreateTableList(i).getAttr().getDimensionList().size(); j++) {
                DataModel dataModel = new DataModel();
                dataModel.setAppId(dataset_id);
                dataModel.setTableName(request.getCreateTableList(i).getTableId());
                dataModel.setFieldName(request.getCreateTableList(i).getAttr().getDimension(j));
                dataModel.setDataType(0);
                dataModel.setViewType(0);
                dataModelService.insertDataModel(dataModel);
            }
            for (int j = 0; j < request.getCreateTableList(i).getAttr().getMatrixList().size(); j++) {
                DataModel dataModel = new DataModel();
                dataModel.setAppId(dataset_id);
                dataModel.setTableName(request.getCreateTableList(i).getTableId());
                dataModel.setFieldName(request.getCreateTableList(i).getAttr().getMatrix(j));
                dataModel.setDataType(1);
                dataModel.setViewType(0);
                dataModelService.insertDataModel(dataModel);
            }
        }
        Data.Builder dataBuilder = Data.newBuilder();
        dataBuilder.setDataSetId(String.valueOf(dataset_id));

        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("success");

        CreateDatasetResponse.Builder createDatasetResponseBuilder = CreateDatasetResponse.newBuilder();
        createDatasetResponseBuilder.setData(dataBuilder);


        createDatasetResponseBuilder.setBaseResp(baseResp);

        responseObserver.onNext(createDatasetResponseBuilder.build());
        responseObserver.onCompleted();

    }

    /***
     * 删除数据集
     * @param request
     * @param responseObserver
     */
    @Override
    public void delete(DeleteDatasetRequest request, StreamObserver<DeleteDatasetResponse> responseObserver) {
        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("success");
        DeleteDatasetResponse.Builder response = DeleteDatasetResponse.newBuilder();
        response.setData(dataSetServiceImpl.DeleteDataSet(request.getId()));
        response.setBaseResp(baseResp);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }
}
