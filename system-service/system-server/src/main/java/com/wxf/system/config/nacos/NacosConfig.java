package com.wxf.system.config.nacos;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Nacos配置
 *
 * @author hujun@ztgame.com
 * @version 1.1.0
 * @since 2023/7/18 10:25:12
 */
@EnableDiscoveryClient
@Configuration
public class NacosConfig {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
