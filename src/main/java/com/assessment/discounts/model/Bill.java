package com.assessment.discounts.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public class Bill {

    @NotNull
    private UserType userType;

    @NotNull
    @Positive
    private BigDecimal amount;

    public Bill(UserType userType, BigDecimal amount) {
        this.userType = userType;
        this.amount = amount;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "userType=" + userType +
                ", amount=" + amount +
                '}';
    }
}

