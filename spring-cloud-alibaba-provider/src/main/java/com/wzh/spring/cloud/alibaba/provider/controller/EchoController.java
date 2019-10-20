package com.wzh.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzh
 * @date 2019/10/14 - 15:16
 */
@RefreshScope
@RestController
public class EchoController {
    @Value("${server.port}")
    String port;
    @Value("${username}")
    String username;
    @GetMapping("echo/{str}")
    public String echo(@PathVariable String str){
        return "hello"+str+",port:"+port+",username:"+username;
    }
}
