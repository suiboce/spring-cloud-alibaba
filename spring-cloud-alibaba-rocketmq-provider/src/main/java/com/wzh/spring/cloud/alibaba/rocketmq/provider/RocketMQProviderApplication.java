package com.wzh.spring.cloud.alibaba.rocketmq.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author wzh
 * @date 2019/10/19 - 11:35
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({Source.class})
@EnableAsync
public class RocketMQProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketMQProviderApplication.class,args);
    }
}
