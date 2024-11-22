package com.qisande.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author qisande
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 8380751456541833762L;
}