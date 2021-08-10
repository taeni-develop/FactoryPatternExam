package com.example.factorypatternexam.point.factory.service;

import com.example.factorypatternexam.point.enums.ProductType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PointCalculateServiceFactory {

    private final Map<ProductType, PointCalculateService> pointCalculateServiceMap = new HashMap<>();

    /**
     * 생성자주입
     * @param pointCalculateServices
     */
    public PointCalculateServiceFactory(List<PointCalculateService> pointCalculateServices) {
        pointCalculateServices.forEach(s -> pointCalculateServiceMap.put(s.getProductType(), s));
    }

    public PointCalculateService getPointCalculateService(ProductType productType) {
        return pointCalculateServiceMap.get(productType);
    }
}