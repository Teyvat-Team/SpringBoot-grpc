package com.localserver.clickhouse.model.po;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel(value = "Schema")
public class SchemaTable {
    private String database;
    private String table;
    private String name;
    private String type;
    private String comment;
}
