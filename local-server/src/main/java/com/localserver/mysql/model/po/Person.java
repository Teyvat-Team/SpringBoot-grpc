package com.localserver.mysql.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xx
 * @since 2022-08-06
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("person")
@ApiModel(value="Person对象", description="")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("PersonId")
    private Integer PersonId;

    @TableField("FirstName")
    private String FirstName;

    @TableField("LastName")
    private String LastName;


}
