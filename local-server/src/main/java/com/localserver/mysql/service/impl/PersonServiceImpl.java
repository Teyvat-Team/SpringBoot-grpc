package com.localserver.mysql.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.localserver.mysql.model.po.Person;
import com.localserver.mysql.mapper.PersonMapper;
import com.localserver.mysql.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author xx
 * @since 2022-08-06
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    public List<Person> list() {
        return personMapper.selectList(new QueryWrapper<Person>().select("PersonId", "FirstName", "LastName"));
    }
}
