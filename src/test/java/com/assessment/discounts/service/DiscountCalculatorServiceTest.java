package com.assessment.discounts.service;

import com.assessment.discounts.model.Bill;
import com.assessment.discounts.model.UserType;
import com.assessment.discounts.service.impl.DefaultDiscountCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalculatorServiceTest {

    private DefaultDiscountCalculator discountCalculator;

    @BeforeEach
    public void setup() {
        discountCalculator = new DefaultDiscountCalculator();
    }

    @Test
    public void testCalculateDiscount() {
        Bill bill = new Bill(UserType.EMPLOYEE, BigDecimal.valueOf(100));
        BigDecimal expectedDiscount = BigDecimal.valueOf(35.0);
        BigDecimal actualDiscount = discountCalculator.calculateDiscount(bill);
        assertEquals(expectedDiscount, actualDiscount);
    }

}
