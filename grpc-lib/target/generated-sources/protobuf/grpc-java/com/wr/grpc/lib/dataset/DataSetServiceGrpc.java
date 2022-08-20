package com.wr.grpc.lib.dataset;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: dataset.proto")
public final class DataSetServiceGrpc {

  private DataSetServiceGrpc() {}

  public static final String SERVICE_NAME = "dataset.DataSetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wr.grpc.lib.dataset.DataSetListRequest,
      com.wr.grpc.lib.dataset.DataSetListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.wr.grpc.lib.dataset.DataSetListRequest.class,
      responseType = com.wr.grpc.lib.dataset.DataSetListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wr.grpc.lib.dataset.DataSetListRequest,
      com.wr.grpc.lib.dataset.DataSetListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.wr.grpc.lib.dataset.DataSetListRequest, com.wr.grpc.lib.dataset.DataSetListResponse> getListMethod;
    if ((getListMethod = DataSetServiceGrpc.getListMethod) == null) {
      synchronized (DataSetServiceGrpc.class) {
        if ((getListMethod = DataSetServiceGrpc.getListMethod) == null) {
          DataSetServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.wr.grpc.lib.dataset.DataSetListRequest, com.wr.grpc.lib.dataset.DataSetListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.dataset.DataSetListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.dataset.DataSetListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataSetServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wr.grpc.lib.dataset.CreateDatasetRequest,
      com.wr.grpc.lib.dataset.CreateDatasetResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.wr.grpc.lib.dataset.CreateDatasetRequest.class,
      responseType = com.wr.grpc.lib.dataset.CreateDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wr.grpc.lib.dataset.CreateDatasetRequest,
      com.wr.grpc.lib.dataset.CreateDatasetResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.wr.grpc.lib.dataset.CreateDatasetRequest, com.wr.grpc.lib.dataset.CreateDatasetResponse> getCreateMethod;
    if ((getCreateMethod = DataSetServiceGrpc.getCreateMethod) == null) {
      synchronized (DataSetServiceGrpc.class) {
        if ((getCreateMethod = DataSetServiceGrpc.getCreateMethod) == null) {
          DataSetServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.wr.grpc.lib.dataset.CreateDatasetRequest, com.wr.grpc.lib.dataset.CreateDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.dataset.CreateDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.dataset.CreateDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataSetServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wr.grpc.lib.dataset.DeleteDatasetRequest,
      com.wr.grpc.lib.dataset.DeleteDatasetResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.wr.grpc.lib.dataset.DeleteDatasetRequest.class,
      responseType = com.wr.grpc.lib.dataset.DeleteDatasetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wr.grpc.lib.dataset.DeleteDatasetRequest,
      com.wr.grpc.lib.dataset.DeleteDatasetResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.wr.grpc.lib.dataset.DeleteDatasetRequest, com.wr.grpc.lib.dataset.DeleteDatasetResponse> getDeleteMethod;
    if ((getDeleteMethod = DataSetServiceGrpc.getDeleteMethod) == null) {
      synchronized (DataSetServiceGrpc.class) {
        if ((getDeleteMethod = DataSetServiceGrpc.getDeleteMethod) == null) {
          DataSetServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.wr.grpc.lib.dataset.DeleteDatasetRequest, com.wr.grpc.lib.dataset.DeleteDatasetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.dataset.DeleteDatasetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.dataset.DeleteDatasetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataSetServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataSetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSetServiceStub>() {
        @java.lang.Override
        public DataSetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSetServiceStub(channel, callOptions);
        }
      };
    return DataSetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataSetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSetServiceBlockingStub>() {
        @java.lang.Override
        public DataSetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSetServiceBlockingStub(channel, callOptions);
        }
      };
    return DataSetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataSetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSetServiceFutureStub>() {
        @java.lang.Override
        public DataSetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSetServiceFutureStub(channel, callOptions);
        }
      };
    return DataSetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DataSetServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.wr.grpc.lib.dataset.DataSetListRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.dataset.DataSetListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建数据集
     * </pre>
     */
    public void create(com.wr.grpc.lib.dataset.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.dataset.CreateDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除数据集
     * </pre>
     */
    public void delete(com.wr.grpc.lib.dataset.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.dataset.DeleteDatasetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wr.grpc.lib.dataset.DataSetListRequest,
                com.wr.grpc.lib.dataset.DataSetListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wr.grpc.lib.dataset.CreateDatasetRequest,
                com.wr.grpc.lib.dataset.CreateDatasetResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wr.grpc.lib.dataset.DeleteDatasetRequest,
                com.wr.grpc.lib.dataset.DeleteDatasetResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class DataSetServiceStub extends io.grpc.stub.AbstractAsyncStub<DataSetServiceStub> {
    private DataSetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSetServiceStub(channel, callOptions);
    }

    /**
     */
    public void list(com.wr.grpc.lib.dataset.DataSetListRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.dataset.DataSetListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建数据集
     * </pre>
     */
    public void create(com.wr.grpc.lib.dataset.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.dataset.CreateDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除数据集
     * </pre>
     */
    public void delete(com.wr.grpc.lib.dataset.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.dataset.DeleteDatasetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DataSetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataSetServiceBlockingStub> {
    private DataSetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSetServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wr.grpc.lib.dataset.DataSetListResponse list(com.wr.grpc.lib.dataset.DataSetListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建数据集
     * </pre>
     */
    public com.wr.grpc.lib.dataset.CreateDatasetResponse create(com.wr.grpc.lib.dataset.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除数据集
     * </pre>
     */
    public com.wr.grpc.lib.dataset.DeleteDatasetResponse delete(com.wr.grpc.lib.dataset.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataSetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataSetServiceFutureStub> {
    private DataSetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSetServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wr.grpc.lib.dataset.DataSetListResponse> list(
        com.wr.grpc.lib.dataset.DataSetListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建数据集
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wr.grpc.lib.dataset.CreateDatasetResponse> create(
        com.wr.grpc.lib.dataset.CreateDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除数据集
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wr.grpc.lib.dataset.DeleteDatasetResponse> delete(
        com.wr.grpc.lib.dataset.DeleteDatasetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_CREATE = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataSetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataSetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.wr.grpc.lib.dataset.DataSetListRequest) request,
              (io.grpc.stub.StreamObserver<com.wr.grpc.lib.dataset.DataSetListResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.wr.grpc.lib.dataset.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.wr.grpc.lib.dataset.CreateDatasetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.wr.grpc.lib.dataset.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.wr.grpc.lib.dataset.DeleteDatasetResponse>) responseObserver);
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

  private static abstract class DataSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataSetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wr.grpc.lib.dataset.DataSetInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataSetService");
    }
  }

  private static final class DataSetServiceFileDescriptorSupplier
      extends DataSetServiceBaseDescriptorSupplier {
    DataSetServiceFileDescriptorSupplier() {}
  }

  private static final class DataSetServiceMethodDescriptorSupplier
      extends DataSetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataSetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataSetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataSetServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
