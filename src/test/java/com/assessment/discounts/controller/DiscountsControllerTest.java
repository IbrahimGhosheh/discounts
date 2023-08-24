package com.assessment.discounts.controller;

import com.assessment.discounts.model.Bill;
import com.assessment.discounts.model.UserType;
import com.assessment.discounts.model.response.DiscountResponse;
import com.assessment.discounts.service.DiscountCalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DiscountsControllerTest {

    private DiscountsController discountsController;

    @Mock
    private DiscountCalculatorService discountCalculatorService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        discountsController = new DiscountsController(discountCalculatorService);
    }

    @Test
    public void testCalculateDiscount() {
        Bill bill = new Bill(UserType.EMPLOYEE, BigDecimal.valueOf(100));

        BigDecimal discount = BigDecimal.valueOf(10);
        when(discountCalculatorService.calculateDiscount(bill)).thenReturn(discount);

        DiscountResponse response = discountsController.calculateDiscount(bill);

        BigDecimal expectedNetPayableAmount = BigDecimal.valueOf(90);
        assertEquals(expectedNetPayableAmount, response.getNetPayableAmount());
        assertEquals(discount, response.getDiscount());
    }

}
