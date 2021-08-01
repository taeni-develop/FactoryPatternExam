package com.example.factorypatternexam.order.plain.controller;

import com.example.factorypatternexam.order.enums.OrderType;
import com.example.factorypatternexam.order.vo.Order;
import com.example.factorypatternexam.order.vo.OrderResult;
import org.springframework.stereotype.Service;

@Service
public class AppDeliveryOrderService {
    public OrderResult appDeliveryOrder(Order order) {
        return OrderResult.builder()
                .orderType(OrderType.APP_DELIVERY_ORDER)
                .orderIdx(1)
                .build();
    }
}
