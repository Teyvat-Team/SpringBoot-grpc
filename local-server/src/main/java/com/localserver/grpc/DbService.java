package com.localserver.grpc;

import com.wr.grpc.lib.db.DBRequest;
import com.wr.grpc.lib.db.DBResponse;
import com.wr.grpc.lib.db.DbServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

/**
 * @author 王瑞
 * @date 2022/8/17
 */
@GrpcService
public class DbService extends DbServiceGrpc.DbServiceImplBase {
    /**
     * 根据数据源类型，获得所有数据库
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void list(DBRequest request, StreamObserver<DBResponse> responseObserver) {
        super.list(request, responseObserver);
    }
}
