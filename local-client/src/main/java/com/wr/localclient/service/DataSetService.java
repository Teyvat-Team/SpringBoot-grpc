package com.wr.localclient.service;

import com.wr.grpc.lib.dataset.*;
import com.wr.grpc.lib.table.*;
import com.wr.localclient.model.po.CreateTable;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Service
public class DataSetService {


    @GrpcClient("local-grpc-server")
    private DataSetServiceGrpc.DataSetServiceBlockingStub dataSetServiceBlockingStub;

    public String testDataSetCreate(CreateTable[] createTables) {
        try {
            CreateDatasetRequest.Builder createDatasetRequestBuilder = CreateDatasetRequest.newBuilder();
            for (CreateTable createTable : createTables) {
                CreateTableList.Builder createTableListBuilder = CreateTableList.newBuilder();
                createTableListBuilder.setName(createTable.getName());
                createTableListBuilder.setDescr(createTable.getDescr());
                createTableListBuilder.setDataSourceName(createTable.getDataSourceName());
                createTableListBuilder.setDbName(createTable.getDbName());
                createTableListBuilder.setTableId(createTable.getTableId());
                createTableListBuilder.setCreateUser(createTable.getCreateUser());

                Attr.Builder attrBuilder = Attr.newBuilder();
                attrBuilder.addAllDimension(Arrays.asList(createTable.getAttr().getDimension()));
                attrBuilder.addAllMatrix(Arrays.asList(createTable.getAttr().getMatrix()));

                createTableListBuilder.setAttr(attrBuilder);

                createDatasetRequestBuilder.addCreateTableList(createTableListBuilder);
            }
            CreateDatasetResponse response = dataSetServiceBlockingStub.create(createDatasetRequestBuilder.build());
            return response.toString();

        } catch (StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String testDataSetList(String createUser, OrderBy orderBy, Order order, Integer page, Integer pageSize, String keyword) {
        try {
            DataSetListRequest.Builder builder = DataSetListRequest.newBuilder();
            builder.setCreateUser(createUser);
            if (orderBy == null)
                builder.setOrderBy(OrderBy.createTime);
            else
                builder.setOrderBy(orderBy);

            if (order == null)
                builder.setOrder(Order.desc);
            else
                builder.setOrder(order);

            if (page == null)
                builder.setPage(1);
            else
                builder.setPage(page);

            if (pageSize == null)
                builder.setPageSize(10);
            else
                builder.setPageSize(pageSize);

            if (keyword == null)
                builder.setKeyword("");
            else
                builder.setKeyword(keyword);

            // 2.调用远程方法
            DataSetListResponse response =
                    dataSetServiceBlockingStub.list(builder.build());
            // 3.返回结果
            return response.toString();

        } catch (StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }

//        try {
//            // 1.构建请求消息
//            DataSetListRequest request = DataSetListRequest.newBuilder().build();
//            // 2.调用远程方法
//            DataSetListResponse response =
//                    dataSetServiceBlockingStub.list(request);
//            // 3.返回结果
//            return response.toString();
//        } catch (StatusRuntimeException e) {
//            return "FAILED with " + e.getStatus().getCode().name();
//        }
    }

//    public String testTableScheam() {
//        try {
//            // 1.构建请求消息
//            TableSchemaRequest request = TableSchemaRequest.newBuilder().build();
//            // 2.调用远程方法
//            TableSchemaResponse response =
//                    tableServiceBlockingStub.schema(request);
//            // 3.返回结果
//            return response.toString();
//        } catch (StatusRuntimeException e) {
//            return "FAILED with " + e.getStatus().getCode().name();
//        }
//    }

}

