package com.ch.springcloud.service;

import com.ch.springcloud.entity.Payment;

public interface PaymentService {

    Payment queryPayment(Integer id);
}
