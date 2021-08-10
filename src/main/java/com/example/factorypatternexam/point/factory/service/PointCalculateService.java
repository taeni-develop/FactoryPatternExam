package com.example.factorypatternexam.point.factory.service;

import com.example.factorypatternexam.point.enums.ProductType;
import com.example.factorypatternexam.point.vo.PointCalculate;

public interface PointCalculateService {
    int calculatePoint(PointCalculate pointCalculate);
    ProductType getProductType();
}
