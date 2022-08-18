package com.wr.grpc.lib.datasource;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *作⽤：⽣成对应.java ⽂件的类名（不能跟下⾯message的类名相同）
 * 关注2：option选项,作⽤：影响 特定环境下 的处理⽅式
 * 关注3：消息模型 作⽤：真正⽤于描述 数据结构
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: datasource.proto")
public final class DataSourceServiceGrpc {

  private DataSourceServiceGrpc() {}

  public static final String SERVICE_NAME = "datasource.DataSourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wr.grpc.lib.datasource.ListRequest,
      com.wr.grpc.lib.datasource.ListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.wr.grpc.lib.datasource.ListRequest.class,
      responseType = com.wr.grpc.lib.datasource.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wr.grpc.lib.datasource.ListRequest,
      com.wr.grpc.lib.datasource.ListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.wr.grpc.lib.datasource.ListRequest, com.wr.grpc.lib.datasource.ListResponse> getListMethod;
    if ((getListMethod = DataSourceServiceGrpc.getListMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getListMethod = DataSourceServiceGrpc.getListMethod) == null) {
          DataSourceServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.wr.grpc.lib.datasource.ListRequest, com.wr.grpc.lib.datasource.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.datasource.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.datasource.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataSourceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceStub>() {
        @java.lang.Override
        public DataSourceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceServiceStub(channel, callOptions);
        }
      };
    return DataSourceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataSourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceBlockingStub>() {
        @java.lang.Override
        public DataSourceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceServiceBlockingStub(channel, callOptions);
        }
      };
    return DataSourceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataSourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceFutureStub>() {
        @java.lang.Override
        public DataSourceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceServiceFutureStub(channel, callOptions);
        }
      };
    return DataSourceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *作⽤：⽣成对应.java ⽂件的类名（不能跟下⾯message的类名相同）
   * 关注2：option选项,作⽤：影响 特定环境下 的处理⽅式
   * 关注3：消息模型 作⽤：真正⽤于描述 数据结构
   * </pre>
   */
  public static abstract class DataSourceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.wr.grpc.lib.datasource.ListRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.datasource.ListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wr.grpc.lib.datasource.ListRequest,
                com.wr.grpc.lib.datasource.ListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   *作⽤：⽣成对应.java ⽂件的类名（不能跟下⾯message的类名相同）
   * 关注2：option选项,作⽤：影响 特定环境下 的处理⽅式
   * 关注3：消息模型 作⽤：真正⽤于描述 数据结构
   * </pre>
   */
  public static final class DataSourceServiceStub extends io.grpc.stub.AbstractAsyncStub<DataSourceServiceStub> {
    private DataSourceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceServiceStub(channel, callOptions);
    }

    /**
     */
    public void list(com.wr.grpc.lib.datasource.ListRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.datasource.ListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *作⽤：⽣成对应.java ⽂件的类名（不能跟下⾯message的类名相同）
   * 关注2：option选项,作⽤：影响 特定环境下 的处理⽅式
   * 关注3：消息模型 作⽤：真正⽤于描述 数据结构
   * </pre>
   */
  public static final class DataSourceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataSourceServiceBlockingStub> {
    private DataSourceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wr.grpc.lib.datasource.ListResponse list(com.wr.grpc.lib.datasource.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *作⽤：⽣成对应.java ⽂件的类名（不能跟下⾯message的类名相同）
   * 关注2：option选项,作⽤：影响 特定环境下 的处理⽅式
   * 关注3：消息模型 作⽤：真正⽤于描述 数据结构
   * </pre>
   */
  public static final class DataSourceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataSourceServiceFutureStub> {
    private DataSourceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wr.grpc.lib.datasource.ListResponse> list(
        com.wr.grpc.lib.datasource.ListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataSourceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataSourceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.wr.grpc.lib.datasource.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.wr.grpc.lib.datasource.ListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataSourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataSourceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wr.grpc.lib.datasource.DataSourceInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataSourceService");
    }
  }

  private static final class DataSourceServiceFileDescriptorSupplier
      extends DataSourceServiceBaseDescriptorSupplier {
    DataSourceServiceFileDescriptorSupplier() {}
  }

  private static final class DataSourceServiceMethodDescriptorSupplier
      extends DataSourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataSourceServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataSourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataSourceServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
