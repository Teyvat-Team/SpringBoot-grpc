package com.localserver.mysql.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.localserver.mysql.mapper.DataModelMapper;
import com.localserver.mysql.mapper.DataSetListMapper;
import com.localserver.mysql.mapper.DataSetMapper;
import com.localserver.mysql.model.po.DataSet;
import com.localserver.mysql.service.IDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DatasetServiceImpl extends ServiceImpl<DataSetMapper, DataSet> implements IDatasetService {
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

    public Boolean DeleteDataSet(String id){
        int i = datasetMapper.deleteById(id);
        return i != 0;
    }



    @Override
    public DataSet getOne(int id) {
        DataSet dataSet = datasetMapper.selectOne(new QueryWrapper<DataSet>().eq("id", id));
        return dataSet;
    }

}
