package com.example.factorypatternexam.point.vo;

import com.example.factorypatternexam.point.enums.ProductType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PointCalculateResult {
    private ProductType productType;
    private int orderIdx;
}
