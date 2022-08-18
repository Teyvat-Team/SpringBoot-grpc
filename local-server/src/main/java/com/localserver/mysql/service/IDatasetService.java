package com.localserver.mysql.service;

import com.localserver.mysql.model.po.DataSet;

import java.util.List;
import java.util.Map;

public interface IDatasetService{
    public Integer insertDataset(DataSet dataset);

    public List<DataSet> listDataset(Map<String, Object> params);

    public List<String> listTableByDatasetId(Integer datasetId);
}

