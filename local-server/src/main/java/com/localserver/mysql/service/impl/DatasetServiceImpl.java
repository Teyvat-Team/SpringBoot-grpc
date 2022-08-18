package com.localserver.mysql.service.impl;

import com.localserver.mysql.mapper.DataModelMapper;
import com.localserver.mysql.mapper.DataSetListMapper;
import com.localserver.mysql.mapper.DatasetMapper;
import com.localserver.mysql.model.po.DataSet;
import com.localserver.mysql.service.IDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DatasetServiceImpl implements IDatasetService {
    @Autowired
    private DatasetMapper datasetMapper;
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
}
