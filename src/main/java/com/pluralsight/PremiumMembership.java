package com.pluralsight;

import java.math.BigDecimal;

public class PremiumMembership extends Membership {
    private int guestPasses;

    public PremiumMembership(String memberName, int months, BigDecimal baseRate, int guestPasses) {
        super(memberName, months, baseRate);
        this.guestPasses = guestPasses;
    }

    public int getGuestPasses() {
        return guestPasses;
    }

    public void setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        BigDecimal price = getBaseRate();
        price = price.subtract(new BigDecimal("18.50"));
        return price;
    }
    public void useGuestPass() {
        if (guestPasses > 0) {
            guestPasses = guestPasses - 1;
            System.out.println(getMemberName() + "has used a guest pass  ");
        } else {
            System.out.println(getMemberName() + "has no more guest passes ");
        }
    }
    @Override
    public BigDecimal getSignUpFee() {
        if (getMonths() >= 12) {
            BigDecimal yearPrice = new BigDecimal("0");
            return yearPrice;
        }else {
            BigDecimal originalPrice = new BigDecimal("49.00");
            return originalPrice;
        }
    }


}
