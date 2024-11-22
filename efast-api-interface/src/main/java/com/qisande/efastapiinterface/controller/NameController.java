package com.qisande.efastapiinterface.controller;

import com.qisande.efastapiclientsdk.model.User;
import com.qisande.efastapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qisande
 * @date 2024-09-28 21:20:22
 * @description: 名称 API
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");
        if (!"qisande".equals(accessKey)) {
            throw new RuntimeException("无权限");
        }
        if (Long.parseLong(nonce) > 10000) {
            throw new RuntimeException("无权限");
        }
        String serverSign = SignUtils.genSign(body, "abcdefgh");
        if (!sign.equals(serverSign)) {
            throw new RuntimeException("无权限");
        }
        return "POST 你的名字是" + user.getUsername();
    }
}
