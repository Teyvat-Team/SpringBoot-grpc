package com.localserver.mysql.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("data_model")
public class DataModel {
    private int id;
    private String tableName;
    private String fieldName;
    private int dataType;
    private int viewType;
    private int appId;
}
