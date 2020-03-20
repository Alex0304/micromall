package com.ch.springcloud.controller;


import com.ch.springcloud.common.CommonResult;
import com.ch.springcloud.entity.Payment;
import com.ch.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;


    @RequestMapping("/queryPayment/{id}")
    public CommonResult queryPayment(@PathVariable Integer id){
        Payment payment = paymentService.queryPayment(id);
        return new CommonResult(1,"success",payment);
    }
}
