package com.localserver.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.localserver.mysql.model.po.DataSet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DataSetMapper extends BaseMapper<DataSet> {
}
