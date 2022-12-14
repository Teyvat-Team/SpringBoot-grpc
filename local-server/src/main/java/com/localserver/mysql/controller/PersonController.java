package com.localserver.mysql.controller;


import cn.hutool.json.JSONArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.localserver.mysql.model.po.Person;
import com.localserver.mysql.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器 示例代码
 * </p>
 *
 * @author xx
 * @since 2022-08-06
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    IPersonService personService;

    @GetMapping("/list")
    public String testRes() {
        System.out.println(personService + "值");
        List<Person> list = personService.list();
        for (Person person : list) {
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", list);
        return jsonObject.toJSONString();
    }

}
