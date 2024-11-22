package com.qisande.efastapicommon.service;


import com.qisande.efastapicommon.model.entity.User;


/**
 * 用户服务
 *
 * @author qisande
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已经分配给用户密钥
     *
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
