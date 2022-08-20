package com.wr.localclient.service;

import com.wr.grpc.lib.search.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xulong
 * @version 1.0
 * @email longxu@mail.ustc.edu.cn
 */

@Service
public class SearchService {
    @GrpcClient("local-grpc-server")
    private SearchServiceGrpc.SearchServiceBlockingStub searchBlockingStub;

    public String sendMessage(SearchInterfaceRequest request) {
        // 1. 构建请求信息
//        SelectList selectList1 = SelectList.newBuilder().setField("Price").setFunction("sum").build();
//        SelectList selectList2 = SelectList.newBuilder().setField("Price").setFunction("topK").build();
//        List<SelectList> selectLists = new ArrayList<>();
//        selectLists.add(selectList1);
//        selectLists.add(selectList2);
//
//        List<String> group_list = new ArrayList<>();
//        group_list.add("Airline");
//
//        Sort sort1 = Sort.newBuilder().setField("Price").setOrder("desc").build();
//        List<Sort> sortLists = new ArrayList<>();
//        sortLists.add(sort1);
//
//        SearchInterfaceRequest.Builder builder = SearchInterfaceRequest.newBuilder();
//        builder.setDatasetId("123");
//        builder.setTableId("plane_info");
//        builder.setCache(false);
//        builder.addAllSelectList(selectLists);
//        builder.setWhereCause("Arrival_time in ('Night', 'Morning')");
//        builder.addAllGroupByList(group_list);
//        builder.addAllSort(sortLists);
//        SearchInterfaceRequest request = builder.build();
         //调用远程方法
        final SearchInterfaceResponse response = this.searchBlockingStub.query(request);
        return response.toString();
    }
}
