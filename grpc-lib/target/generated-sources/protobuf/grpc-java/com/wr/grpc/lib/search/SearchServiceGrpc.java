package com.wr.grpc.lib.search;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: search.proto")
public final class SearchServiceGrpc {

  private SearchServiceGrpc() {}

  public static final String SERVICE_NAME = "search.SearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wr.grpc.lib.search.SearchInterfaceRequest,
      com.wr.grpc.lib.search.SearchInterfaceResponse> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = com.wr.grpc.lib.search.SearchInterfaceRequest.class,
      responseType = com.wr.grpc.lib.search.SearchInterfaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wr.grpc.lib.search.SearchInterfaceRequest,
      com.wr.grpc.lib.search.SearchInterfaceResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<com.wr.grpc.lib.search.SearchInterfaceRequest, com.wr.grpc.lib.search.SearchInterfaceResponse> getQueryMethod;
    if ((getQueryMethod = SearchServiceGrpc.getQueryMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getQueryMethod = SearchServiceGrpc.getQueryMethod) == null) {
          SearchServiceGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<com.wr.grpc.lib.search.SearchInterfaceRequest, com.wr.grpc.lib.search.SearchInterfaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.search.SearchInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wr.grpc.lib.search.SearchInterfaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("Query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceStub>() {
        @java.lang.Override
        public SearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceStub(channel, callOptions);
        }
      };
    return SearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceBlockingStub>() {
        @java.lang.Override
        public SearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceBlockingStub(channel, callOptions);
        }
      };
    return SearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceFutureStub>() {
        @java.lang.Override
        public SearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceFutureStub(channel, callOptions);
        }
      };
    return SearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void query(com.wr.grpc.lib.search.SearchInterfaceRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.search.SearchInterfaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wr.grpc.lib.search.SearchInterfaceRequest,
                com.wr.grpc.lib.search.SearchInterfaceResponse>(
                  this, METHODID_QUERY)))
          .build();
    }
  }

  /**
   */
  public static final class SearchServiceStub extends io.grpc.stub.AbstractAsyncStub<SearchServiceStub> {
    private SearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void query(com.wr.grpc.lib.search.SearchInterfaceRequest request,
        io.grpc.stub.StreamObserver<com.wr.grpc.lib.search.SearchInterfaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SearchServiceBlockingStub> {
    private SearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wr.grpc.lib.search.SearchInterfaceResponse query(com.wr.grpc.lib.search.SearchInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SearchServiceFutureStub> {
    private SearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wr.grpc.lib.search.SearchInterfaceResponse> query(
        com.wr.grpc.lib.search.SearchInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY:
          serviceImpl.query((com.wr.grpc.lib.search.SearchInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<com.wr.grpc.lib.search.SearchInterfaceResponse>) responseObserver);
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

  private static abstract class SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wr.grpc.lib.search.SearchInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchService");
    }
  }

  private static final class SearchServiceFileDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier {
    SearchServiceFileDescriptorSupplier() {}
  }

  private static final class SearchServiceMethodDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchServiceFileDescriptorSupplier())
              .addMethod(getQueryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
