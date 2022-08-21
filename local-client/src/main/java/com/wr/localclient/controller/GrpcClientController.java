package com.wr.localclient.controller;

import com.wr.grpc.lib.dataset.DataSetListRequest;
import com.wr.grpc.lib.dataset.Order;
import com.wr.grpc.lib.dataset.OrderBy;
import com.wr.grpc.lib.search.SearchInterfaceRequest;
import com.wr.localclient.model.po.CreateTable;
import com.wr.localclient.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 王瑞
 * @date 2022/8/6
 */

@RestController
public class GrpcClientController {
    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/w")
    public String printMessage(@RequestParam(defaultValue = "will") String name) {
        return grpcClientService.sendMessage(name);
    }

    @Autowired
    private DataSourceService dataSourceService;

    @RequestMapping("/r")
    public String getRes() {
        // 调用出错可能是端口问题
        return dataSourceService.sendMessage();
    }

    @Autowired
    private TableService tableService;

    @RequestMapping("/table/list")
    public String tableList() {
        // data { dbName: "Ticket_info" dbTable
        // { tableName: "plane_info" tableId: "0" } dbTable { tableName: "weather_info" tableId: "1" } }
        // baseResp { code: 200 message: "success" }
        return tableService.testTableList();
    }

    @RequestMapping("/table/schema")
    public String tableSchema() {
        // schema { name: "Id" type: "UInt32" } schema { name: "Airline" type: "String" }
        return tableService.testTableScheam();
    }
    @RequestMapping("/table/info")
    public String tableinfo() {
        // schema { name: "Id" type: "UInt32" } schema { name: "Airline" type: "String" }
        return tableService.tableInfo("25","plane_info");
    }


    @Autowired
    private DataSetService dataSetService;

    @RequestMapping("/dataset/list")
    public String dataSetList(@RequestParam(value = "createUser") String createUser,
                              @RequestParam(value = "orderBy", required = false) OrderBy orderBy,
                              @RequestParam(value = "order", required = false) Order order,
                              @RequestParam(value = "page", required = false) Integer page,
                              @RequestParam(value = "pageSize", required = false) Integer pageSize,
                              @RequestParam(value = "keyword", required = false) String keyword) {
        return dataSetService.testDataSetList(createUser, orderBy, order, page, pageSize, keyword);
    }

    @RequestMapping(value = "/dataset/create",method = RequestMethod.POST)
    public String dataSetCreate(@RequestBody CreateTable[] createTables) {
        return dataSetService.testDataSetCreate(createTables);
    }

    @Autowired
    private SearchService searchService;
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String getSearch(@RequestBody SearchInterfaceRequest request) {
        return searchService.sendMessage(request);
    }

}

