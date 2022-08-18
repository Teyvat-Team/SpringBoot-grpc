package com.localserver.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.localserver.mysql.model.po.DataModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DataModelMapper extends BaseMapper<DataModel> {
}
