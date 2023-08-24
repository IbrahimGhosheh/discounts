package com.assessment.discounts.controller;

import com.assessment.discounts.model.Bill;
import com.assessment.discounts.model.response.DiscountResponse;
import com.assessment.discounts.service.DiscountCalculatorService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class DiscountsController {

    private final DiscountCalculatorService discountCalculatorService;

    public DiscountsController(DiscountCalculatorService discountCalculatorService) {
        this.discountCalculatorService = discountCalculatorService;
    }

    @PostMapping("/calculateDiscount")
    public DiscountResponse calculateDiscount(@Valid @RequestBody Bill bill) {
        logger.info("Accept calculate discount request for bill: " + bill);
        BigDecimal discount = discountCalculatorService.calculateDiscount(bill);
        BigDecimal netPayableAmount = bill.getAmount().subtract(discount);
        return new DiscountResponse(netPayableAmount, discount);
    }

    private final Logger logger = LoggerFactory.getLogger(DiscountsController.class);

}
