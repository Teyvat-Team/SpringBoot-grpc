package com.localserver.mysql.model.po;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "维度和指标", description = "")
public class Attr {
    private String[] dimension;
    private String[] matrix;
}
