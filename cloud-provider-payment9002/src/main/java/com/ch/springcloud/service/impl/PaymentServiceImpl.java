package com.ch.springcloud.service.impl;

import com.ch.springcloud.entity.Payment;
import com.ch.springcloud.mapper.PaymentDao;
import com.ch.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    public Payment queryPayment(Integer id ){
        return paymentDao.queryPayment(id);
    }
}
