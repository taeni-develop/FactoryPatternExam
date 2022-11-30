package com.example.factorypatternexam.point.factory.service;

import com.example.factorypatternexam.point.enums.ProductType;
import com.example.factorypatternexam.point.vo.PointCalculate;
import org.springframework.stereotype.Service;

@Service
public class FactoryClothesPointCalculateService implements PointCalculateService {

    @Override
    public int calculatePoint(PointCalculate pointCalculate) {
        return (int) Math.ceil(pointCalculate.getPrice() * 0.05);
    }

    @Override
    public ProductType getProductType() {
        return ProductType.CLOTHES;
    }
}