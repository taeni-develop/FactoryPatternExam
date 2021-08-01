package com.example.factorypatternexam.order.controller;

import com.example.factorypatternexam.order.enums.OrderType;
import com.example.factorypatternexam.order.plain.service.AppDeliveryOrderService;
import com.example.factorypatternexam.order.plain.service.VisitOrderService;
import com.example.factorypatternexam.order.plain.service.WebDeliveryOrderService;
import com.example.factorypatternexam.order.vo.Order;
import com.example.factorypatternexam.order.vo.OrderResult;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrderPlainController {
    private final AppDeliveryOrderService appDeliveryOrderService;
    private final WebDeliveryOrderService webDeliveryOrderService;
    private final VisitOrderService visitOrderService;

    @PostMapping("/order/plain")
    public ResponseEntity<OrderResult> order(@RequestBody Order order) {
        OrderResult orderResult;
        if (order.getOrderType() == OrderType.APP_DELIVERY_ORDER) {
            orderResult = appDeliveryOrderService.appDeliveryOrder(order);
        } else if (order.getOrderType() == OrderType.WEB_DELIVERY_ORDER) {
            orderResult = webDeliveryOrderService.wppDeliveryOrder(order);
        } else if (order.getOrderType() == OrderType.VISIT_ORDER) {
            orderResult = visitOrderService.visitOrder(order);
        } else {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(orderResult);
    }
}
