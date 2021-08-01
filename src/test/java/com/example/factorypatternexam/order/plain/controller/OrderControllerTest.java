package com.example.factorypatternexam.order.plain.controller;

import com.example.factorypatternexam.order.controller.OrderPlainController;
import com.example.factorypatternexam.order.enums.OrderType;
import com.example.factorypatternexam.order.vo.Order;
import com.example.factorypatternexam.order.vo.OrderResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class OrderControllerTest {

    @Autowired
    private OrderPlainController orderPlainController;

    @Test
    public void webDeliveryOrder_if_success() {
        order_if_success(OrderType.WEB_DELIVERY_ORDER);
    }

    @Test
    public void appDeliveryOrder_if_success() {
        order_if_success(OrderType.APP_DELIVERY_ORDER);
    }

    @Test
    public void visitOrder_if_success() {
        order_if_success(OrderType.VISIT_ORDER);
    }

    private void order_if_success(OrderType orderType) {
        Order order = Order.builder()
                .orderType(orderType)
                .build();
        ResponseEntity<OrderResult> orderResult = orderPlainController.order(order);

        assert(orderResult.getStatusCode() == HttpStatus.OK);
        assert(orderResult.getBody().getOrderIdx() == 1);
        assert(orderResult.getBody().getOrderType().equals(orderType));
    }


}