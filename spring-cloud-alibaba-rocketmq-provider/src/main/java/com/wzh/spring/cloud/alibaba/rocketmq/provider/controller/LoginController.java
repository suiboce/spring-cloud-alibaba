package com.wzh.spring.cloud.alibaba.rocketmq.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzh
 * @date 2019/10/21 - 15:09
 */
@RestController
public class LoginController {
    // 获取name为output的binding
    @Autowired
    private MessageChannel output;
    @GetMapping("login/{username}")
    public String login(@PathVariable String username){
        sendMsg(username);
        return username+"登录成功";
    }

    @Async
    public void sendMsg(String username){
        output.send(MessageBuilder.withPayload("hello "+username).build());
    }
}
