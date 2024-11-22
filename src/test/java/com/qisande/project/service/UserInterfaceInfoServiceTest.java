package com.qisande.project.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author qisande
 * @date 2024-10-01 17:47:32
 * @description:
 */
@SpringBootTest
class UserInterfaceInfoServiceTest {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Test
    void invokeCount() {
        boolean result = userInterfaceInfoService.invokeCount(1L, 1L);
        Assertions.assertTrue(result);
    }
}