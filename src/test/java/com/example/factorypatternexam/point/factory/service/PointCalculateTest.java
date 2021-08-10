package com.example.factorypatternexam.point.factory.service;

import com.example.factorypatternexam.point.enums.ProductType;
import com.example.factorypatternexam.point.vo.PointCalculate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PointCalculateTest {

    private final int PRICE = 10000;

    @Autowired
    private PointCalculateServiceFactory pointCalculateServiceFactory;

    @Test
    public void clothesPointCalculate_if_success() {
        assert(calculatePoint(ProductType.CLOTHES) == 500);
    }

    @Test
    public void foodPointCalculate_if_success() {
        assert(calculatePoint(ProductType.FOOD) == 300);
    }

    @Test
    public void electronicsPointCalculate_if_success() {
        assert(calculatePoint(ProductType.ELECTRONICS) == 1000);
    }

    private int calculatePoint(ProductType productType) {
        PointCalculate pointCalculate = PointCalculate.builder()
                .price(PRICE)
                .productType(productType)
                .build();
        return pointCalculateServiceFactory.getPointCalculateService(productType).calculatePoint(pointCalculate);
    }
}