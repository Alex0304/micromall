package com.ch.cloud.config;

import com.ch.cloud.config.properties.CacheServiceConfigProperties;
import com.ch.cloud.service.CacheService;
import com.ch.cloud.service.impl.CacheServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(CacheService.class)
@EnableConfigurationProperties(CacheServiceConfigProperties.class)
public class CacheServiceConfig {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "cache.service",value = "enable" ,havingValue = "true")
    public CacheService cacheService(CacheServiceConfigProperties cacheServiceConfigProperties){
        return new CacheServiceImpl().setConfig(cacheServiceConfigProperties.getConfig());
    }
}
