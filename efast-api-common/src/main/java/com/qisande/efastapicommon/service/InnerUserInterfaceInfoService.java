package com.qisande.efastapicommon.service;


/**
* @author qisande
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-10-01 17:06:31
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
