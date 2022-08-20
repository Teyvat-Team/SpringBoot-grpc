package com.localserver.mysql.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.localserver.mysql.mapper.DataModelMapper;
import com.localserver.mysql.mapper.DataSetListMapper;
import com.localserver.mysql.mapper.DataSetMapper;
import com.localserver.mysql.model.po.DataModel;
import com.localserver.mysql.model.po.DataSet;
import com.localserver.mysql.service.IDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataSetServiceImpl extends ServiceImpl<DataSetMapper, DataSet> implements IDatasetService {
    @Autowired
    private DataSetMapper datasetMapper;
    @Autowired
    private DataSetListMapper dataSetListMapper;
    @Autowired
    private DataModelMapper dataModelMapper;

    public Integer insertDataset(DataSet dataset) {
        datasetMapper.insert(dataset);
        return dataset.getId();
    }

    @Override
    public List<DataSet> listDataset(Map<String, Object> params) {
        return dataSetListMapper.queryLearnResouceList(params);
    }

    public List<String> listTableByDatasetId(Integer datasetId) {
        return dataModelMapper.listTableByDatasetId(datasetId);
    }

    @Override
    public DataSet getOne(int id) {
        return null;
    }

    public Boolean DeleteDataSet(String id) {
        int i = datasetMapper.deleteById(id);
        final HashMap<String, Object> deleteMap = new HashMap<String, Object>();
        deleteMap.put("app_id", id);
        dataModelMapper.deleteByMap(deleteMap);
        return i != 0;
    }

}
