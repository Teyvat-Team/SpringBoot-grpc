package com.localserver.mysql.service.impl;

import com.localserver.mysql.model.po.Person;
import com.localserver.mysql.service.IPersonService;
import com.wr.grpc.lib.*;
import com.wr.grpc.lib.datasource.Data;
import com.wr.grpc.lib.datasource.DataSourceServiceGrpc;
import com.wr.grpc.lib.datasource.ListRequest;
import com.wr.grpc.lib.datasource.ListResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王瑞
 * @date 2022/8/6
 */
@GrpcService
public class DataSourceServiceImpl extends DataSourceServiceGrpc.DataSourceServiceImplBase {
    @Autowired
    private IPersonService iPersonService;

    @Override
    public void list(ListRequest request, StreamObserver<ListResponse> responseObserver) {
      /*  message ListResponse {
            repeated Data data = 1;
            base.BaseResp baseResp = 255;
        }

        message Data {
            string dataSourceName = 1;
            string dataSourceType = 2;
        }*/
        BaseResp.Builder baseResp = BaseResp.newBuilder();
        baseResp.setCode(200);
        baseResp.setMessage("成功");
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "wang", "li"));
        list.add(new Person(2, "fun", "uo"));


        ListResponse.Builder builder = ListResponse.newBuilder().setBaseResp(baseResp);
        for (int i = 0; i < list.size(); i++) {
            Data.Builder data = Data.newBuilder();
            data.setDataSourceName(list.get(i).getFirstName());
            data.setDataSourceType(list.get(i).getLastName());
            builder.addData(data);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();


    }
}
