package com.assessment.discounts.service.impl;

import com.assessment.discounts.model.Bill;
import com.assessment.discounts.service.DiscountCalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DefaultDiscountCalculator implements DiscountCalculatorService {

    private static final double DISCOUNT_PER_100 = 5.0;

    public BigDecimal calculateDiscount(Bill bill) {
        BigDecimal userDiscount = bill.getAmount()
                .multiply(bill.getUserType().getDiscountRate());
        BigDecimal amountDiscount = bill.getAmount()
                .divideToIntegralValue(BigDecimal.valueOf(100))
                .multiply(BigDecimal.valueOf(DISCOUNT_PER_100));
        logger.info("User discount: " + userDiscount + " amount discount: " + amountDiscount);
        return userDiscount.add(amountDiscount);
    }

    private final Logger logger = LoggerFactory.getLogger(DefaultDiscountCalculator.class);

}
