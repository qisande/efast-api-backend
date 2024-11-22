package com.qisande.efastapicommon.service;


import com.qisande.efastapicommon.model.entity.InterfaceInfo;

/**
* @author qisande
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-09-28 19:37:07
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟借口是否存在
     *
     * @param url
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String url, String method);
}
