package com.wr.grpc.lib.table;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: table.proto")
public final class TableServiceGrpc {

  private TableServiceGrpc() {}

  public static final String SERVICE_NAME = "table.TableService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wr.grpc.lib.table.TableRequest,
      com.wr.grpc.lib.table.TableResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.wr.grpc.lib.table.TableRequest.class,
      responseType = com.wr.grpc.lib.table.TableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wr.grpc.lib.table.TableRequest,
      com.wr.grpc.lib.table.TableResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.wr.grpc.lib.table.TableRequest, com.wr.grpc.lib.table.TableResponse> getListMethod;
    if ((getListMethod = TableServiceGrpc.getListMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getListMethod = TableServiceGrpc.getListMethod) == null) {
          TableServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.wr.grpc.lib.table.TableRequest, com.wr.grpc.lib.table.TableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.table.TableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.table.TableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wr.grpc.lib.table.TableSchemaRequest,
      com.wr.grpc.lib.table.TableSchemaResponse> getSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schema",
      requestType = com.wr.grpc.lib.table.TableSchemaRequest.class,
      responseType = com.wr.grpc.lib.table.TableSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wr.grpc.lib.table.TableSchemaRequest,
      com.wr.grpc.lib.table.TableSchemaResponse> getSchemaMethod() {
    io.grpc.MethodDescriptor<com.wr.grpc.lib.table.TableSchemaRequest, com.wr.grpc.lib.table.TableSchemaResponse> getSchemaMethod;
    if ((getSchemaMethod = TableServiceGrpc.getSchemaMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getSchemaMethod = TableServiceGrpc.getSchemaMethod) == null) {
          TableServiceGrpc.getSchemaMethod = getSchemaMethod =
              io.grpc.MethodDescriptor.<com.wr.grpc.lib.table.TableSchemaRequest, com.wr.grpc.lib.table.TableSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.table.TableSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.table.TableSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Schema"))
              .build();
        }
      }
    }
    return getSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wr.grpc.lib.table.DataTableInfoRequest,
      com.wr.grpc.lib.table.DataTableInfoResponse> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = com.wr.grpc.lib.table.DataTableInfoRequest.class,
      responseType = com.wr.grpc.lib.table.DataTableInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wr.grpc.lib.table.DataTableInfoRequest,
      com.wr.grpc.lib.table.DataTableInfoResponse> getInfoMethod() {
    io.grpc.MethodDescriptor<com.wr.grpc.lib.table.DataTableInfoRequest, com.wr.grpc.lib.table.DataTableInfoResponse> getInfoMethod;
    if ((getInfoMethod = TableServiceGrpc.getInfoMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getInfoMethod = TableServiceGrpc.getInfoMethod) == null) {
          TableServiceGrpc.getInfoMethod = getInfoMethod =
              io.grpc.MethodDescriptor.<com.wr.grpc.lib.table.DataTableInfoRequest, com.wr.grpc.lib.table.DataTableInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.table.DataTableInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.table.DataTableInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Info"))
              .build();
        }
      }
    }
    return getInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TableServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableServiceStub>() {
        @java.lang.Override
        public TableServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableServiceStub(channel, callOptions);
        }
      };
    return TableServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TableServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableServiceBlockingStub>() {
        @java.lang.Override
        public TableServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableServiceBlockingStub(channel, callOptions);
        }
      };
    return TableServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TableServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableServiceFutureStub>() {
        @java.lang.Override
        public TableServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableServiceFutureStub(channel, callOptions);
        }
      };
    return TableServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TableServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 数据源下的所有表
     * </pre>
     */
    public void list(com.wr.grpc.lib.table.TableRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.table.TableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 数据源中表的 schema
     * </pre>
     */
    public void schema(com.wr.grpc.lib.table.TableSchemaRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.table.TableSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * 数据集中单个数据表信息
     * </pre>
     */
    public void info(com.wr.grpc.lib.table.DataTableInfoRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.table.DataTableInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wr.grpc.lib.table.TableRequest,
                com.wr.grpc.lib.table.TableResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wr.grpc.lib.table.TableSchemaRequest,
                com.wr.grpc.lib.table.TableSchemaResponse>(
                  this, METHODID_SCHEMA)))
          .addMethod(
            getInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wr.grpc.lib.table.DataTableInfoRequest,
                com.wr.grpc.lib.table.DataTableInfoResponse>(
                  this, METHODID_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class TableServiceStub extends io.grpc.stub.AbstractAsyncStub<TableServiceStub> {
    private TableServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 数据源下的所有表
     * </pre>
     */
    public void list(com.wr.grpc.lib.table.TableRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.table.TableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 数据源中表的 schema
     * </pre>
     */
    public void schema(com.wr.grpc.lib.table.TableSchemaRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.table.TableSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 数据集中单个数据表信息
     * </pre>
     */
    public void info(com.wr.grpc.lib.table.DataTableInfoRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.table.DataTableInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TableServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TableServiceBlockingStub> {
    private TableServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 数据源下的所有表
     * </pre>
     */
    public com.wr.grpc.lib.table.TableResponse list(com.wr.grpc.lib.table.TableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 数据源中表的 schema
     * </pre>
     */
    public com.wr.grpc.lib.table.TableSchemaResponse schema(com.wr.grpc.lib.table.TableSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 数据集中单个数据表信息
     * </pre>
     */
    public com.wr.grpc.lib.table.DataTableInfoResponse info(com.wr.grpc.lib.table.DataTableInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TableServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TableServiceFutureStub> {
    private TableServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 数据源下的所有表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wr.grpc.lib.table.TableResponse> list(
        com.wr.grpc.lib.table.TableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 数据源中表的 schema
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wr.grpc.lib.table.TableSchemaResponse> schema(
        com.wr.grpc.lib.table.TableSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 数据集中单个数据表信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wr.grpc.lib.table.DataTableInfoResponse> info(
        com.wr.grpc.lib.table.DataTableInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_SCHEMA = 1;
  private static final int METHODID_INFO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TableServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TableServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.wr.grpc.lib.table.TableRequest) request,
              (io.grpc.stub.StreamObserver<com.wr.grpc.lib.table.TableResponse>) responseObserver);
          break;
        case METHODID_SCHEMA:
          serviceImpl.schema((com.wr.grpc.lib.table.TableSchemaRequest) request,
              (io.grpc.stub.StreamObserver<com.wr.grpc.lib.table.TableSchemaResponse>) responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info((com.wr.grpc.lib.table.DataTableInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.wr.grpc.lib.table.DataTableInfoResponse>) responseObserver);
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

  private static abstract class TableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TableServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wr.grpc.lib.table.TableInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TableService");
    }
  }

  private static final class TableServiceFileDescriptorSupplier
      extends TableServiceBaseDescriptorSupplier {
    TableServiceFileDescriptorSupplier() {}
  }

  private static final class TableServiceMethodDescriptorSupplier
      extends TableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TableServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TableServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TableServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getSchemaMethod())
              .addMethod(getInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
