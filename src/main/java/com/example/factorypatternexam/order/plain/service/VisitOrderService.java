package com.example.factorypatternexam.order.plain.service;

import com.example.factorypatternexam.order.vo.Order;
import com.example.factorypatternexam.order.vo.OrderResult;
import org.springframework.stereotype.Service;

@Service
public class VisitOrderService {
    public OrderResult visitOrder(Order order) {
        return OrderResult.builder()
                .orderIdx(1)
                .build();
    }
}
