package com.assessment.discounts.model;

import java.math.BigDecimal;

public enum UserType {
    EMPLOYEE(BigDecimal.valueOf(0.3)),
    CUSTOMER(BigDecimal.valueOf(0.1));

    private final BigDecimal discountRate;

    UserType(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }
}
