package com.wzh.spring.cloud.alibaba.consumer.feign.service;

import com.wzh.spring.cloud.alibaba.consumer.feign.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wzh
 * @date 2019/10/15 - 17:10
 */
@FeignClient(name = "provider",fallback = EchoServiceFallback.class)
public interface EchoService {
    @GetMapping("echo/{str}")
    public String echo(@PathVariable String str);
}
