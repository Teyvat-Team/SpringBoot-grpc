package com.localserver.mysql.service.impl;

import com.localserver.mysql.mapper.DataModelMapper;
import com.localserver.mysql.mapper.DataSetMapper;
import com.localserver.mysql.model.po.DataModel;
import com.localserver.mysql.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TableServiceImpl implements ITableService {
    @Autowired
    DataModelMapper dataModelMapper;
    @Autowired
    DataSetMapper dataSetMapper;
    @Override
    public List<DataModel> ListDataModel(int dataSetId,String tablename) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("app_id",dataSetId);
        map.put("table_name",tablename);
        return dataModelMapper.selectByMap(map);
    }
}
