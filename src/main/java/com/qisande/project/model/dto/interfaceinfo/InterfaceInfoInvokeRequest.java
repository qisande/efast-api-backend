package com.qisande.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 请求参数
     */
    private String requestParams;

    private static final long serialVersionUID = 2582630208017237331L;
}