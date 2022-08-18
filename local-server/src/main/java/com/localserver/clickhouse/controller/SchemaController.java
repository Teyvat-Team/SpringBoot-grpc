package com.localserver.clickhouse.controller;

import com.alibaba.fastjson.JSONObject;
import com.localserver.clickhouse.model.po.SchemaTable;
import com.localserver.clickhouse.service.ISchemaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@ApiOperation("测试接口")
@RestController
@RequestMapping("/schma")
public class SchemaController {
    @Autowired
    private ISchemaService schemaService;

    @ApiOperation("查询数据")
    @GetMapping("/selectSchema")
    public String selectSchema(@RequestParam(value = "tableName") String tableName) {
        List<SchemaTable> schemas = schemaService.selectSchema(tableName);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", schemas);
        return jsonObject.toJSONString();
    }

}

