package com.qisande.project.service;

import com.qisande.efastapicommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author qisande
* @description 针对表【interface_info(接口信息)】的数据库操作 Service
* @createDate 2024-09-28 19:37:07
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
