package com.wzh.spring.cloud.alibaba.rocketmq.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author wzh
 * @date 2019/10/19 - 11:35
 */
@SpringBootApplication
@EnableBinding({Source.class})
public class RocketMQProviderApplication implements CommandLineRunner {
    // 获取name为output的binding
    @Autowired
    private MessageChannel output;
    public static void main(String[] args) {
        SpringApplication.run(RocketMQProviderApplication.class,args);
    }
    /**
     * 实现了 CommandLineRunner 接口，只是为了 Spring Boot 启动时执行任务，不必特别在意
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        output.send(MessageBuilder.withPayload("hello Rocket").build());
    }
}
