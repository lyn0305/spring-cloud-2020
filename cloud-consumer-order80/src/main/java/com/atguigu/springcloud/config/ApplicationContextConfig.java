package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

//    增加负载均衡轮询
    @Bean
//    @LoadBalanced 注释掉测试自己手写的算法
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
