package com.assessment.discounts.service;

import com.assessment.discounts.model.Bill;

import java.math.BigDecimal;

public interface DiscountCalculatorService {
    BigDecimal calculateDiscount(Bill bill);
}
