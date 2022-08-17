package com.wr.localclient.controller;

import com.wr.localclient.service.DataSourceService;
import com.wr.localclient.service.GrpcClientService;
import com.wr.localclient.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


}

