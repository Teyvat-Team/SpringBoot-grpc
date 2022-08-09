package com.localserver.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.localserver.mysql.model.po.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author xx
 * @since 2022-08-06
 */
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}
