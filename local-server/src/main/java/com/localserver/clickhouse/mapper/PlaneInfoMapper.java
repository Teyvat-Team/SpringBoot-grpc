package com.localserver.clickhouse.mapper;

import com.localserver.clickhouse.model.po.PlaneInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * plane_info Mapper 接口
 * </p>
 *
 * @author xx
 * @since 2022-08-10
 */
@Mapper
public interface PlaneInfoMapper extends BaseMapper<PlaneInfo> {

    @Select("select name from system.tables where database = #{databaseName};")
    List<String> findAllTables(String databaseName);

    @Select("select name,type,comment,is_in_partition_key  " +
            "from system.columns " +
            "where database = #{databaseName} and table = #{tableName}")
    List<Map<String, Object>> findTableSchema(String databaseName, String tableName);

    @Select("select name,type,comment,is_in_partition_key  " +
            "from system.columns " +
            "where database = #{databaseName} and table = #{tableName} and name = #{column}")
    List<Map<String, Object>> findColumnInfo(String databaseName, String tableName, String column);

}
