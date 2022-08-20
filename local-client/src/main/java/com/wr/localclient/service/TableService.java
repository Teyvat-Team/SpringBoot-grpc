package com.wr.localclient.service;

import com.wr.grpc.lib.table.*;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author 王瑞
 * @date 2022/8/6
 */
@Service
public class TableService {


    @GrpcClient("local-grpc-server")
    private TableServiceGrpc.TableServiceBlockingStub tableServiceBlockingStub;

    public String testTableList() {
        try {
            // 1.构建请求消息
            TableRequest request = TableRequest.newBuilder().build();
            // 2.调用远程方法
            TableResponse response =
                    tableServiceBlockingStub.list(request);
            // 3.返回结果
            return response.toString();
        } catch (StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public String testTableScheam() {
        try {
            // 1.构建请求消息
            TableSchemaRequest request = TableSchemaRequest.newBuilder().build();
            // 2.调用远程方法
            TableSchemaResponse response =
                    tableServiceBlockingStub.schema(request);
            // 3.返回结果
            return response.toString();
        } catch (StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
    public String tableInfo(String datasetId,String tableId) {
        try {
            // 1.构建请求消息
            DataTableInfoRequest request = DataTableInfoRequest.newBuilder().setDatasetId(datasetId).setDataTableId(tableId).build();
            // 2.调用远程方法
            DataTableInfoResponse response =
                    tableServiceBlockingStub.info(request);
            // 3.返回结果
            return response.toString();
        } catch (StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }


}
