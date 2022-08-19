package com.localserver.clickhouse.service;

import com.localserver.clickhouse.model.po.PlaneInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * plane_info 服务类
 * </p>
 *
 * @author xx
 * @since 2022-08-10
 */
public interface IPlaneInfoService extends IService<PlaneInfo> {
    public List<PlaneInfo> listRes();

    List<String> findAllTables(String databaseName);

    List<Map<String, Object>> findTableSchema(String databaseName, String tableName);

    List<Map<String, Object>> findTableSchema(String databaseName, String tableName, String column);
}
