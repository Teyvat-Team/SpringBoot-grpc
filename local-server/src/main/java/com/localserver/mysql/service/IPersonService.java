package com.localserver.mysql.service;

import com.localserver.mysql.model.po.Person;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xx
 * @since 2022-08-06
 */
public interface IPersonService extends IService<Person> {


    public List<Person> list();
}
