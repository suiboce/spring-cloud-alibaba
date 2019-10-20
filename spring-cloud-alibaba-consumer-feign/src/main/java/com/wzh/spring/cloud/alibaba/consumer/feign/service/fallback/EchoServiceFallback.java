package com.wzh.spring.cloud.alibaba.consumer.feign.service.fallback;

import com.wzh.spring.cloud.alibaba.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author wzh
 * @date 2019/10/16 - 14:15
 */
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String str) {
        return "你的网络有问题";
    }
}
