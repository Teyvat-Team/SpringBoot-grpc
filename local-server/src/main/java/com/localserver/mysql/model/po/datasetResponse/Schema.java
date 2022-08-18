package com.localserver.mysql.model.po.datasetResponse;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Schema", description = "")
public class Schema {
    private String name;
    private String type;
    private String descr;
    private boolean isPartition;
}
