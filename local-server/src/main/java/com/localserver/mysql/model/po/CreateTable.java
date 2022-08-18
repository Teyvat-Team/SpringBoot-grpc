package com.localserver.mysql.model.po;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "创建表对象", description = "")
public class CreateTable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name; //数据集名称
    private String descr; //数据集描述
    private String dataSourceName; //数据源名称
    private String dbName; // 数据库名称
    private String tableId; //表 id
    private String createUser; // 创建用户
    private Attr attr; // 维度和指标
}
