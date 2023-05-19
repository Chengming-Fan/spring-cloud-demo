package com.fan.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Chengming Fan on 2023/5/16 16:30
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced // 在客户端使用RestTemplate请求服务端时, 开启负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
