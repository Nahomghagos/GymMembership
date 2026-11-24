package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership {
    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean offPeakOnly) {
        super(memberName, months, baseRate);
        this.offPeakOnly = offPeakOnly;
    }

    public boolean isOffPeakOnly() {
        return offPeakOnly;
    }

    public void setOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
    }

    @Override
    public String toString() {
        return "Basic | " + getMemberName() + " | " + getMonths() + " months | off-peak only: " + offPeakOnly;
    }

    // java: illegal start of type
    @Override
    /*public BigDecimal getMonthlyPrice() {
        BigDecimal price = getBaseRate();
        if (offPeakOnly) {
            price = price.subtract(new BigDecimal("5.00"));
        }
        return price;
    }*/
}

