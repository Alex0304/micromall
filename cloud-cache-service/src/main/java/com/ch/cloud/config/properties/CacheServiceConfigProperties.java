package com.ch.cloud.config.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "cache.service")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Component
public class CacheServiceConfigProperties {

    private String config;
}
