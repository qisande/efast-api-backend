package com.qisande.project.model.vo;

import com.qisande.efastapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author qisande
 * @date 2024-10-04 20:42:06
 * @description: 接口信息封装图
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo implements Serializable {

    private static final long serialVersionUID = 8551707384496438294L;

    /**
     * 调用次数
     */
    private Integer totalNum;
}
