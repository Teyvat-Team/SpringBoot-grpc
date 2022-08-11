package com.localserver.clickhouse.controller;


import com.alibaba.fastjson.JSONObject;
import com.localserver.clickhouse.model.po.PlaneInfo;
import com.localserver.clickhouse.service.IPlaneInfoService;
import com.localserver.mysql.model.po.Person;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * plane_info 前端控制器
 * </p>
 *
 * @author xx
 * @since 2022-08-10
 */
@ApiOperation("测试接口")
@RestController
@RequestMapping("/plane-info")
public class PlaneInfoController {
    @Autowired
    private IPlaneInfoService iPlaneInfoService;

    @ApiOperation("查询数据")
    @GetMapping("/list")
    public String testRes() {
        List<PlaneInfo> list = iPlaneInfoService.list();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", list);
        return jsonObject.toJSONString();
    }

}
