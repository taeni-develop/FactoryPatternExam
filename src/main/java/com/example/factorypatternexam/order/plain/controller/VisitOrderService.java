package com.example.factorypatternexam.order.plain.controller;

import com.example.factorypatternexam.order.enums.OrderType;
import com.example.factorypatternexam.order.vo.Order;
import com.example.factorypatternexam.order.vo.OrderResult;
import org.springframework.stereotype.Service;

@Service
public class VisitOrderService {
    public OrderResult visitOrder(Order order) {
        return OrderResult.builder()
                .orderType(OrderType.VISIT_ORDER)
                .orderIdx(1)
                .build();
    }
}
