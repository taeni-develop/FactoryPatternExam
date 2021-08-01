package com.example.factorypatternexam.order.vo;

import com.example.factorypatternexam.order.enums.OrderType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Order {
    private OrderType orderType;
    private String userId;
    private String shippingAddress;
}
