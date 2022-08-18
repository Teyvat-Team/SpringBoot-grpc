package com.localserver.mysql.model.po;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "DatasetId对象", description = "")
public class DatasetId implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
}

