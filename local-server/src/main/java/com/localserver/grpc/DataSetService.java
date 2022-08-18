package com.localserver.grpc;

import com.localserver.mysql.mapper.DataSetMapper;
import com.wr.grpc.lib.BaseResp;
import com.wr.grpc.lib.dataset.*;
import com.wr.grpc.lib.datasource.DataSourceServiceGrpc;
import com.wr.grpc.lib.datasource.ListRequest;
import com.wr.grpc.lib.datasource.ListResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 王瑞
 * @date 2022/8/17
 */
@GrpcService
public class DataSetService extends DataSetServiceGrpc.DataSetServiceImplBase {
    @Autowired
    com.localserver.mysql.service.impl.DataSetService dataSetService;
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
        String id = request.getId();
        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("success");
        DeleteDatasetResponse.Builder response = DeleteDatasetResponse.newBuilder();
        response.setData(dataSetService.DeleteDataSet(id));
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
