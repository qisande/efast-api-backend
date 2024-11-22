package com.qisande.efastapiinterface;

import com.qisande.efastapiclientsdk.client.EFastApiClient;
import com.qisande.efastapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class EFastApiInterfaceApplicationTests {

    @Resource
    private EFastApiClient EFastApiClient;

    @Test
    void contextLoads() {
        // 调用efast-apiClient的getNameByGet方法，并传入参数"qisande"，将返回的结果赋值给result变量
        String result = EFastApiClient.getNameByGet("qisande");
        // 创建一个User对象
        User user = new User();
        // 设置User对象的username属性为"qisande"
        user.setUsername("qisande");
        // 调用efast-apiClient的getUserNameByPost方法，并传入user对象作为参数，将返回的结果赋值给usernameByPost变量
        String usernameByPost = EFastApiClient.getUsernameByPost(user);
        // 打印result变量的值
        System.out.println(result);
        // 打印usernameByPost变量的值
        System.out.println(usernameByPost);
    }

}
