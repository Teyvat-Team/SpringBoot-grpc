package com.wr.localclient.service;

import com.wr.grpc.lib.HelloReply;
import com.wr.grpc.lib.HelloRequest;
import com.wr.grpc.lib.SimpleGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author 王瑞
 * @date 2022/8/6
 */
@Service
public class GrpcClientService {
    @GrpcClient("local-grpc-server")
    private SimpleGrpc.SimpleBlockingStub simpleStub;

    public String sendMessage(final String name) {
        try {
            // 1.构建请求消息
            HelloRequest request = HelloRequest.newBuilder().setName(name).build();
            // 2.调用远程方法
            final HelloReply response =
                    this.simpleStub.sayHello(request);
            // 3.返回结果
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

}
