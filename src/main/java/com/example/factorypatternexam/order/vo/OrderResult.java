package com.example.factorypatternexam.order.vo;

import com.example.factorypatternexam.order.enums.OrderType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class OrderResult {
    private OrderType orderType;
    private int orderIdx;
}
