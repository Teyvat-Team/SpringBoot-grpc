package com.localserver.mysql.controller;


import cn.hutool.json.JSONArray;
import com.localserver.mysql.model.po.Person;
import com.localserver.mysql.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
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
        //QueryWrapper<Person> select = new QueryWrapper<Person>().select("*");
        System.out.println(personService + "值");
        List<Person> list = personService.list();
        JSONArray objects = new JSONArray();
        objects.addAll(list);
        return objects.toString();
    }

}
