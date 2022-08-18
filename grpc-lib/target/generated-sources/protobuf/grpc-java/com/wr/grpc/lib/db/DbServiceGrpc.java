package com.wr.grpc.lib.db;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: db.proto")
public final class DbServiceGrpc {

  private DbServiceGrpc() {}

  public static final String SERVICE_NAME = "db.DbService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wr.grpc.lib.db.DBRequest,
      com.wr.grpc.lib.db.DBResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.wr.grpc.lib.db.DBRequest.class,
      responseType = com.wr.grpc.lib.db.DBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wr.grpc.lib.db.DBRequest,
      com.wr.grpc.lib.db.DBResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.wr.grpc.lib.db.DBRequest, com.wr.grpc.lib.db.DBResponse> getListMethod;
    if ((getListMethod = DbServiceGrpc.getListMethod) == null) {
      synchronized (DbServiceGrpc.class) {
        if ((getListMethod = DbServiceGrpc.getListMethod) == null) {
          DbServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.wr.grpc.lib.db.DBRequest, com.wr.grpc.lib.db.DBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.db.DBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.db.DBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DbServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DbServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DbServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DbServiceStub>() {
        @java.lang.Override
        public DbServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DbServiceStub(channel, callOptions);
        }
      };
    return DbServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DbServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DbServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DbServiceBlockingStub>() {
        @java.lang.Override
        public DbServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DbServiceBlockingStub(channel, callOptions);
        }
      };
    return DbServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DbServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DbServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DbServiceFutureStub>() {
        @java.lang.Override
        public DbServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DbServiceFutureStub(channel, callOptions);
        }
      };
    return DbServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DbServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void list(com.wr.grpc.lib.db.DBRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.db.DBResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wr.grpc.lib.db.DBRequest,
                com.wr.grpc.lib.db.DBResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class DbServiceStub extends io.grpc.stub.AbstractAsyncStub<DbServiceStub> {
    private DbServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DbServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DbServiceStub(channel, callOptions);
    }

    /**
     */
    public void list(com.wr.grpc.lib.db.DBRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.db.DBResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DbServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DbServiceBlockingStub> {
    private DbServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DbServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DbServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wr.grpc.lib.db.DBResponse list(com.wr.grpc.lib.db.DBRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DbServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DbServiceFutureStub> {
    private DbServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DbServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DbServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wr.grpc.lib.db.DBResponse> list(
        com.wr.grpc.lib.db.DBRequest request) {
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
    private final DbServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DbServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.wr.grpc.lib.db.DBRequest) request,
              (io.grpc.stub.StreamObserver<com.wr.grpc.lib.db.DBResponse>) responseObserver);
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

  private static abstract class DbServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DbServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wr.grpc.lib.db.DbInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DbService");
    }
  }

  private static final class DbServiceFileDescriptorSupplier
      extends DbServiceBaseDescriptorSupplier {
    DbServiceFileDescriptorSupplier() {}
  }

  private static final class DbServiceMethodDescriptorSupplier
      extends DbServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DbServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DbServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DbServiceFileDescriptorSupplier())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
