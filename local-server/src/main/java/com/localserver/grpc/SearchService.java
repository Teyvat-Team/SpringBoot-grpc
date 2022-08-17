package com.localserver.grpc;

import com.wr.grpc.lib.search.SearchInterfaceRequest;
import com.wr.grpc.lib.search.SearchInterfaceResponse;
import com.wr.grpc.lib.search.SearchServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import javax.management.Query;

/**
 * @author 王瑞
 * @date 2022/8/17
 */
@GrpcService
public class SearchService extends SearchServiceGrpc.SearchServiceImplBase {

    /**
     * 查询接口
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void query(SearchInterfaceRequest request, StreamObserver<SearchInterfaceResponse> responseObserver) {
        super.query(request, responseObserver);
    }
}
