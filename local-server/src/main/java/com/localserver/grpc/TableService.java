package com.localserver.grpc;

import com.alibaba.fastjson.JSONObject;
import com.localserver.clickhouse.model.po.PlaneInfo;
import com.localserver.clickhouse.service.IPlaneInfoService;
import com.wr.grpc.lib.BaseResp;
import com.wr.grpc.lib.datasource.ListResponse;
import com.wr.grpc.lib.table.*;
import io.grpc.stub.StreamObserver;
import io.swagger.annotations.ApiOperation;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.zip.CheckedOutputStream;

/**
 * @author 王瑞
 * @date 2022/8/17
 */
@GrpcService
public class TableService extends TableServiceGrpc.TableServiceImplBase {
    @Autowired
    private IPlaneInfoService iPlaneInfoService;

    /**
     * 数据源下的所有表
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void list(TableRequest request, StreamObserver<TableResponse> responseObserver) {
        // 数据源名称
        String dataSourceName = request.getDataSourceName();
        // 固定数据库
        List<String> allTables = iPlaneInfoService.findAllTables("Ticket_info");
        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("success");
        TableResponse.Builder response = TableResponse.newBuilder();
        // 封装表名
        TableList.Builder tableList = TableList.newBuilder();
        for (int i = 0; i < allTables.size(); i++) {
            // 从里向外封装数据
            DBTable.Builder table = DBTable.newBuilder();
            table.setTableId(i + "");
            table.setTableName(allTables.get(i));
            // 暂时固定
            tableList.setDbName("Ticket_info");
            tableList.addDbTable(table);
        }
        response.addData(tableList).setBaseResp(baseResp);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    /**
     * 数据源中表的 schema
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void schema(TableSchemaRequest request, StreamObserver<TableSchemaResponse> responseObserver) {
        // 数据源名称
        String dataSourceName = request.getDataSourceName();
        // 数据库名称
        String dbName = request.getDbName();
        // Todo 需要表名
        String tableId = request.getTableId();
        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("success");

        TableSchemaResponse.Builder response = TableSchemaResponse.newBuilder();
        // 表的结构信息
        List<Map<String, Object>> tableSchema = iPlaneInfoService.findTableSchema("Ticket_info", "plane_info");
        for (Map<String, Object> map : tableSchema) {
            Schema.Builder schema = Schema.newBuilder();
            Set<String> column = map.keySet();
            Iterator<String> iterator = column.iterator();
            while (iterator.hasNext()) {
                String next = iterator.next();
                if ("name".equals(next)) {
                    schema.setName((String) map.get("name"));
                }
                if ("comment".equals(next)) {
                    schema.setDescr((String) map.get("comment"));
                }
                if ("type".equals(next)) {
                    schema.setType((String) map.get("type"));
                }
                if ("is_in_partition_key".equals(next)) {
                    int value = (int) map.get("is_in_partition_key");
                    if (value == 0) {
                        schema.setIsPartition(false);
                    } else {
                        schema.setIsPartition(true);
                    }
                }
            }
            response.addSchema(schema);
        }
        response.setBaseResp(baseResp);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    /**
     * 数据集中单个数据表信息
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void info(DataTableInfoRequest request, StreamObserver<DataTableInfoResponse> responseObserver) {
        super.info(request, responseObserver);
    }
}