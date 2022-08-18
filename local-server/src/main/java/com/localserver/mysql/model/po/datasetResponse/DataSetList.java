package com.localserver.mysql.model.po.datasetResponse;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "DataSetList", description = "")
public class DataSetList {
    private String createTime;
    private String name;
    private String descr;
    private String dataSourceType;
    private String id;
    private String createUser;
    private String dbName;
    private String tableName;
    private String tableId;
    private Schema[] schema;
}
