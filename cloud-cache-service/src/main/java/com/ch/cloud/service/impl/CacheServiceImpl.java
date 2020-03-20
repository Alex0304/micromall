package com.ch.cloud.service.impl;

import com.ch.cloud.service.CacheService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CacheServiceImpl implements CacheService {

    private String config;


    @Override
    public String queryForString(String key) {
        return config+"测试starter场景启动器"+key;
    }
}
