package com.localserver.grpc;

import com.wr.grpc.lib.dataset.*;
import com.wr.grpc.lib.datasource.DataSourceServiceGrpc;
import com.wr.grpc.lib.datasource.ListRequest;
import com.wr.grpc.lib.datasource.ListResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author 王瑞
 * @date 2022/8/17
 */
@GrpcService
public class DataSetService extends DataSetServiceGrpc.DataSetServiceImplBase {
    /**
     * 数据集列表
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void list(DataSetListRequest request, StreamObserver<DataSetListResponse> responseObserver) {
        super.list(request, responseObserver);
    }

    /***
     * 创建数据集
     * @param request
     * @param responseObserver
     */
    @Override
    public void create(CreateDatasetRequest request, StreamObserver<CreateDatasetResponse> responseObserver) {
        super.create(request, responseObserver);
    }

    /***
     * 删除数据集
     * @param request
     * @param responseObserver
     */
    @Override
    public void delete(DeleteDatasetRequest request, StreamObserver<DeleteDatasetResponse> responseObserver) {
        super.delete(request, responseObserver);
    }
}
