package com.localserver.clickhouse.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.localserver.clickhouse.model.po.PlaneInfo;
import com.localserver.clickhouse.mapper.PlaneInfoMapper;
import com.localserver.clickhouse.service.IPlaneInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * plane_info 服务实现类
 * </p>
 *
 * @author xx
 * @since 2022-08-10
 */
@Service
public class PlaneInfoServiceImpl extends ServiceImpl<PlaneInfoMapper, PlaneInfo> implements IPlaneInfoService {
    @Autowired
    private PlaneInfoMapper planeInfoMapper;


    @Override
    public List<PlaneInfo> listRes() {
        return planeInfoMapper.selectList(new QueryWrapper<PlaneInfo>().last("limit 0, 2"));
    }

    @Override
    public List<String> findAllTables(String databaseName) {
        return planeInfoMapper.findAllTables(databaseName);
    }

    @Override
    public  List<Map<String, Object>> findTableSchema(String databaseName, String tableName) {
        return planeInfoMapper.findTableSchema(databaseName, tableName);
    }
}
