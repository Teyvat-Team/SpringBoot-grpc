package com.localserver.mysql.service;

import com.localserver.mysql.model.po.DataModel;
import com.wr.grpc.lib.search.Rows;

import java.util.List;

public interface ITableService {
    List<DataModel> ListDataModel(int dataSetId,String tablename);
}
