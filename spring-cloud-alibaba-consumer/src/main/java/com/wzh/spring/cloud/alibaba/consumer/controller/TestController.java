package com.wzh.spring.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wzh
 * @date 2019/10/15 - 16:44
 */
@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("echo/{str}")
    public String echo(@PathVariable String str){
        return restTemplate.getForObject("http://provider/echo/"+str,String.class);
    }
}
