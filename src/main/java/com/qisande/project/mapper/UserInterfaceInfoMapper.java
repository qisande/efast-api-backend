package com.qisande.project.mapper;

import com.qisande.efastapicommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author qisande
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作 Mapper
* @createDate 2024-10-01 17:06:31
* @Entity com.qisande.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




