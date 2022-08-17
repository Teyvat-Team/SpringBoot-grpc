package com.wr.localclient.service;

import com.wr.grpc.lib.datasource.DataSourceServiceGrpc;
import com.wr.grpc.lib.datasource.ListRequest;
import com.wr.grpc.lib.datasource.ListResponse;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author 王瑞
 * @date 2022/8/6
 */
@Service
public class DataSourceService {
    @GrpcClient("local-grpc-server")
    private DataSourceServiceGrpc.DataSourceServiceBlockingStub dataSourceServiceBlockingStub;

    public String sendMessage() {
        try {
            // 1.构建请求消息
            ListRequest request = ListRequest.newBuilder().build();
            // 2.调用远程方法
            ListResponse response =
                    dataSourceServiceBlockingStub.list(request);
            // 3.返回结果
            return response.toString();
        } catch (StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }


}
