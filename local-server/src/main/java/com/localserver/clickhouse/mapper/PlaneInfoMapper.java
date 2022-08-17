package com.localserver.clickhouse.mapper;

import com.localserver.clickhouse.model.po.PlaneInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface PlaneInfoMapper extends BaseMapper<PlaneInfo> {

    @Select("select name from system.tables where database = #{databaseName};")
    List<String> findAllTables(String databaseName);

    @Select("select name,type,comment,is_in_partition_key  from system.columns where database = 'Ticket_info' and table = 'plane_info'")
    List<Map<String, Object>> findTableSchema(String databaseName, String tableName);
}
