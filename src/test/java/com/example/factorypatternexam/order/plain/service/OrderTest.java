package com.example.factorypatternexam.order.plain.service;

import com.example.factorypatternexam.order.enums.OrderType;
import com.example.factorypatternexam.order.vo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderTest {

    @Autowired
    private AppDeliveryOrderService appDeliveryOrderService;

    @Test
    public void order_if_success() {
        Order order = Order.builder()
                .orderType(OrderType.APP_DELIVERY_ORDER)
                .build();



        assertEquals(appDeliveryOrderService.appDeliveryOrder(order).getOrderIdx(), 1);
    }

}