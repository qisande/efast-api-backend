package com.qisande.project.service;

import com.qisande.efastapicommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author qisande
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作 Service
* @createDate 2024-10-01 17:06:31
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 校验
     *
     * @param userInterfaceInfo
     * @param add
     */
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
