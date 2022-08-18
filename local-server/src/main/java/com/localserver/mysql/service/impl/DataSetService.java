package com.localserver.mysql.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.localserver.mysql.mapper.DataSetMapper;
import com.localserver.mysql.model.po.DataSet;
import com.localserver.mysql.model.po.Person;
import com.wr.grpc.lib.db.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSetService {
    @Autowired
    private DataSetMapper dataSetMapper;
    public Boolean DeleteDataSet(String id){
        int i = dataSetMapper.deleteById(id);
        return i != 0;
    }
    public List<DataSet> getDataSetbyUser(String createUser, String Orderby,String order,int page,int pagesize,String keyword){
        Page<DataSet> dataSetPage = new Page<>(page,pagesize);


    }
}
