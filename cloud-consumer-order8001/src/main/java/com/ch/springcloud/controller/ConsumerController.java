package com.ch.springcloud.controller;

import com.ch.cloud.service.CacheService;
import com.ch.springcloud.common.CommonResult;
import com.ch.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class ConsumerController {

    @Resource
    private CacheService cacheService;

    //private static final String PROVIDER_SERVICE = "http://127.0.0.1:9001";
    private static final String PROVIDER_SERVICE = "http://SPRINGCLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("queryPayment/{id}")
    public CommonResult queryPayment(@PathVariable Integer id){
        log.info("1111111");
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(PROVIDER_SERVICE + "/queryPayment/" + id, CommonResult.class);
        return restTemplate.getForObject(PROVIDER_SERVICE + "/queryPayment/" + id, CommonResult.class);
    }

    @RequestMapping("/queryCache/{id}")
    public String queryCache(@PathVariable String id){
        return cacheService.queryForString(id);
    }
}
