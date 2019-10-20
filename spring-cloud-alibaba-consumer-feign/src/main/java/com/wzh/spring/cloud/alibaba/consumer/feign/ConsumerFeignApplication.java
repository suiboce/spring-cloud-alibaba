package com.wzh.spring.cloud.alibaba.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wzh
 * @date 2019/10/15 - 17:08
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class,args);
    }
}
