package com.localserver.mysql.service.impl;

import com.localserver.mysql.mapper.DataModelMapper;
import com.localserver.mysql.model.po.DataModel;
import com.localserver.mysql.service.IDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataModelServiceImpl implements IDataModelService {
    @Autowired
    private DataModelMapper dataModelMapper;

    @Override
    public void insertDataModel(DataModel dataModel) {
        dataModelMapper.insert(dataModel);
    }
}
