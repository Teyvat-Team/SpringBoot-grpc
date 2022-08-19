package com.localserver.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.localserver.mysql.model.po.DataModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DataModelMapper extends BaseMapper<DataModel> {
    @Insert("INSERT INTO data_model(app_id,table_name,field_name,data_type,view_type) " +
            "VALUES(#{appId}, #{tableName}, #{fieldName},#{dataType},#{viewType})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insert(DataModel dataModel);

    @Select("select table_name from data_model where app_id=#{dataset_id}")
    List<String> listTableByDatasetId(@Param(value = "dataset_id") Integer datasetId);
}
