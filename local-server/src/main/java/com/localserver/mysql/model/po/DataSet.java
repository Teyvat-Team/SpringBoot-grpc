package com.localserver.mysql.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("data_set")
public class DataSet {
    private static final long serialVersionUID = 1L;
    private int id;
    private String data_name;
    private String data_descr;
    private String data_source_type;
    private String db_name;
    private String creat_user;
    private String create_time;
    private int status;
}
