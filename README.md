项目来源 https://edu.51cto.com/center/course/lesson/index?id=781159
## 前置工作

安装IDEA的protobuf插件

## grpc-lib

1. 编写.proto文件，文件目录和src/main/java同一层级
2. 分别点击Maven->grpc-lib->Plugins->protobuf下的 compile compile-custom

## local-server

核心代码GrpcServerService，实现.proto定义的方法

* 使⽤@GrpcService注解，再继承SimpleImplBase，这样就可以借助grpc-server-spring-boot-starter库
* 将sayHello暴露为gRPC服务；
* SimpleImplBase是前⽂中根据proto⾃动⽣成的java代码，在grpc-lib模块中；
* sayHello⽅法中处理完毕业务逻辑后，调⽤HelloReply.onNext⽅法填⼊返回内容；
* 调⽤HelloReply.onCompleted⽅法表示本次gRPC服务完成；
* ⾄此，gRPC服务端编码就完成了

## local-client

GrpcClientService 接收参数，并调用服务端的实现

* 1.构建请求消息
* 2.调用远程方法
* 3.返回结果# SpringBoot-grpc
# SpringBoot-grpc
