package com.localserver.mysql.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.localserver.mysql.model.po.DataModel;

import java.util.List;

public interface IDataModelService extends IService<DataModel> {
    public void insertDataModel(DataModel dataModel);

    List<String> findDim(int id);
    List<String> findDim4one(int id,String tablename);

    List<String> findIndi(int id);
    List<String> findIndi4one(int id,String tablename);

}
