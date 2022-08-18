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
@ApiModel(value = "DataSetListResponseData", description = "")
public class DataSetListResponseData {
    private DataSetList[] dataSetList;
    private Integer totalCount;
}
