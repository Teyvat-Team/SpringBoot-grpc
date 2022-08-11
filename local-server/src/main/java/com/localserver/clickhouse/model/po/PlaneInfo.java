package com.localserver.clickhouse.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>
 * plane_info
 * </p>
 *
 * @author xx
 * @since 2022-08-10
 */
@Data
@AllArgsConstructor
@TableName("plane_info")
@ApiModel(value = "PlaneInfo对象", description = "plane_info")
public class PlaneInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField(value = "Airline")
    private String Airline;

    @TableField(value = "Flight")
    private String Flight;

    @TableField(value = "Source_city")
    private String Source_city;

    @TableField(value = "Departure_time")
    private String Departure_time;

    @TableField(value = "Stops")
    private String Stops;

    @TableField(value = "Arrival_time")
    private String Arrival_time;

    @TableField(value = "Destination_city")
    private String Destination_city;

    @TableField("Class")
    private String type;

    @TableField(value = "Duration")
    private Float Duration;

    @TableField(value = "Days_left")
    private Integer Days_left;

    @TableField(value = "Price")
    private Integer Price;


}
