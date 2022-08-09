package com.localserver.mysql.service.impl;

import com.wr.grpc.lib.HelloReply;
import com.wr.grpc.lib.HelloRequest;
import com.wr.grpc.lib.SimpleGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Date;

/**
 * @author 王瑞
 * @date 2022/8/6
 * 使⽤@GrpcService注解，再继承SimpleImplBase，这样就可以借助grpc-server-spring-boot-starter库
 * 将sayHello暴露为gRPC服务；
 * SimpleImplBase是前⽂中根据proto⾃动⽣成的java代码，在grpc-lib模块中；
 * sayHello⽅法中处理完毕业务逻辑后，调⽤HelloReply.onNext⽅法填⼊返回内容；
 * 调⽤HelloReply.onCompleted⽅法表示本次gRPC服务完成；
 * ⾄此，gRPC服务端编码就完成了
 */
@GrpcService
public class GrpcServerService extends SimpleGrpc.SimpleImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

        HelloReply reply = HelloReply.newBuilder().setMessage("你好， " +
                request.getName() + ", " + new Date()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }


}
