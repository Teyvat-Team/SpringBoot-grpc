package com.localserver.clickhouse.service;

import com.localserver.clickhouse.model.po.PlaneInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

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
}
