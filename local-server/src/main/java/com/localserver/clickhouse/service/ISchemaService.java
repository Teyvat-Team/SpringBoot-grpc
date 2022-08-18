package com.localserver.clickhouse.service;


import com.localserver.clickhouse.model.po.SchemaTable;

import java.util.List;


public interface ISchemaService {
    public List<SchemaTable> selectSchema(String table_name);
}
