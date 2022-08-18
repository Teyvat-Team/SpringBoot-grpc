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
@TableName("data_set")
public class DataSet {
    private static final long serialVersionUID = 1L;
    private int id;
    private String dataName;
    private String dataDescr;
    private String dataSourceType;
    private String dbName;
    private String createUser;
    private String createTime;
    private int status;
}
