package com.example.factorypatternexam.point.service;

import com.example.factorypatternexam.point.vo.PointCalculate;
import org.springframework.stereotype.Service;

@Service
public class ClothesPointCalculateService {
    public int calculatePoint(PointCalculate pointCalculate) {
        return (int) Math.ceil(pointCalculate.getPrice() * 0.05);
    }
}
