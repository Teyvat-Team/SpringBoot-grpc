package com.localserver.mysql.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("data_model")
public class DataModel {
    private int id;
    private String table_name;
    private String field_name;
    private int data_type;
    private int view_type;
    private int app_id;
}
