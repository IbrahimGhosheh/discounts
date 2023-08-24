package com.assessment.discounts.model.response;

import java.math.BigDecimal;

public class DiscountResponse {
    private BigDecimal netPayableAmount;
    private BigDecimal discount;

    public DiscountResponse(BigDecimal netPayableAmount, BigDecimal discount) {
        this.netPayableAmount = netPayableAmount;
        this.discount = discount;
    }

    public BigDecimal getNetPayableAmount() {
        return netPayableAmount;
    }

    public void setNetPayableAmount(BigDecimal netPayableAmount) {
        this.netPayableAmount = netPayableAmount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}
