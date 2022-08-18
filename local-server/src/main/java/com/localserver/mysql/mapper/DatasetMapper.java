package com.localserver.mysql.mapper;


import com.localserver.mysql.model.po.DataSet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface DatasetMapper {
    @Insert("INSERT INTO data_set(data_name,data_descr,data_source_type,db_name,create_user,create_time) " +
            "VALUES(#{dataName}, #{dataDescr}, #{dataSourceType},#{dbName},#{createUser},#{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insert(DataSet dataset);
}
