package com.localserver.mysql.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.localserver.mysql.mapper.DataModelMapper;
import com.localserver.mysql.model.po.DataModel;
import com.localserver.mysql.service.IDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataModelServiceImpl extends ServiceImpl<DataModelMapper, DataModel> implements IDataModelService {
    @Autowired
    private DataModelMapper dataModelMapper;

    @Override
    public void insertDataModel(DataModel dataModel) {
        dataModelMapper.insert(dataModel);
    }

    @Override
    public List<String> findDim(int id) {
        QueryWrapper<DataModel> wrapper = new QueryWrapper<DataModel>()
                .eq("data_type", 0).eq("app_id", id);
        List<DataModel> dataModels = dataModelMapper.selectList(wrapper);
        List<String> res = new ArrayList<>();
        for (DataModel dataModel : dataModels) {
            res.add(dataModel.getFieldName());
        }
        return res;
    }

    @Override
    public List<String> findIndi(int id) {
        QueryWrapper<DataModel> wrapper = new QueryWrapper<DataModel>()
                .eq("data_type", 1).eq("app_id", id);
        List<DataModel> dataModels = dataModelMapper.selectList(wrapper);
        List<String> res = new ArrayList<>();
        for (DataModel dataModel : dataModels) {
            res.add(dataModel.getFieldName());
        }
        return res;
    }

    @Override
    public String tableInfo(int id) {
        String tableName = dataModelMapper.tableInfo(id);
        return tableName;
    }
}
