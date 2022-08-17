package com.localserver.mysql.model.po;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class User {
    private int id;
    private String username;
    private String password;

}
