package com.localserver.mysql.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.localserver.mysql.model.po.DataSet;

import java.util.List;
import java.util.Map;

public interface IDatasetService extends IService<DataSet> {
    public Integer insertDataset(DataSet dataset);

    public List<DataSet> listDataset(Map<String, Object> params);

    public List<String> listTableByDatasetId(Integer datasetId);

    DataSet getOne(int id);
}

