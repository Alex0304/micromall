package com.ch.cloud.service;


/**
 * 定义对缓存的增删改查接口
 */
public interface CacheService {

    String queryForString(String key);
}
