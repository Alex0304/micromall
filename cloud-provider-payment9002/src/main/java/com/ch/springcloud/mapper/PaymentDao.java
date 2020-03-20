package com.ch.springcloud.mapper;


import com.ch.springcloud.entity.Payment;

public interface PaymentDao{
    Payment queryPayment(Integer id);
}
