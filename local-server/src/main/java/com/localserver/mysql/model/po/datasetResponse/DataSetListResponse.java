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
@ApiModel(value = "DataSetListResponse", description = "")
public class DataSetListResponse {
    private DataSetListResponseData[] dataSetListResponseData;
}
