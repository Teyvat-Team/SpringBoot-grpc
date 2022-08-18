package com.localserver.clickhouse.mapper;


import com.localserver.clickhouse.model.po.SchemaTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface SchemaMapper {
    public List<SchemaTable> selectSchema(@Param("table_name") String table_name);
}
