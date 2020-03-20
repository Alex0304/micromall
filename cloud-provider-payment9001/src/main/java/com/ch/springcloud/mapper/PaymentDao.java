package com.ch.springcloud.mapper;

import com.ch.springcloud.entity.Payment;

//@Mapper
public interface  PaymentDao {

   Payment queryPayment(Integer id);
}
