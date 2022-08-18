package com.localserver.clickhouse.service.impl;

import com.localserver.clickhouse.mapper.SchemaMapper;
import com.localserver.clickhouse.model.po.SchemaTable;
import com.localserver.clickhouse.service.ISchemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchemaServiceImpl implements ISchemaService {
    @Autowired
    private SchemaMapper schemaMapper;

    @Override
    public List<SchemaTable> selectSchema(String table_name) {
        return schemaMapper.selectSchema(table_name);
    }
}
