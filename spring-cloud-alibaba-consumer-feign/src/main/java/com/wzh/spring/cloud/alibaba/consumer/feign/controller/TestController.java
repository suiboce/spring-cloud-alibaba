package com.wzh.spring.cloud.alibaba.consumer.feign.controller;

import com.wzh.spring.cloud.alibaba.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzh
 * @date 2019/10/15 - 17:10
 */
@RestController
public class TestController {
    @Autowired
    EchoService echoService;
    @GetMapping("echo/{str}")
    public String echo(@PathVariable String str){
        return echoService.echo(str);
    }
}
