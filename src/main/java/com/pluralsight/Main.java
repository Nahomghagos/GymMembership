package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(" === GymMemberships === ");


        Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00")
        );
       /* System.out.println(henry.getMemberName()
                + ", " +
                henry.getMonths() +
                " months, $" +
                henry.getMonthlyPrice() +
                " per month");*/

        //System.out.println(henry);

        BasicMembership alice = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"),
                true
        );

        BasicMembership bob = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"),
                false
        );
       /* System.out.println(alice.getMemberName() +
                        ", " +
                        alice.getMonths() +
                        " months, $" +
                        alice.getMonthlyPrice() +
                        " per month"
        );*/
       // System.out.println(alice);

        /*System.out.println(bob.getMemberName() +
                        ", " +
                        bob.getMonths() +
                        " months, $" +
                        bob.getMonthlyPrice() +
                        " per month"
        );*/
       // System.out.println(bob);

        PremiumMembership carol = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"),
                2);

        PremiumMembership frank = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"),
                0);

       /* System.out.println(carol.getMemberName() +
                ", " +
                carol.getMonths() +
                " months, $" +
                carol.getMonthlyPrice() +
                " per month, guest passes left " +
                carol.getGuestPasses()
        );*/
       // System.out.println(carol);

        /*System.out.println(frank.getMemberName() +
                ", " +
                frank.getMonths() +
                " months, $" +
                frank.getMonthlyPrice() +
                " per month, guest passes left  " +
                frank.getGuestPasses()
        );*/
       // System.out.println(frank);

        FamilyMembership grace = new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"),
                3
        );

        FamilyMembership emma = new FamilyMembership("Emma Wilson", 6, new BigDecimal("30.00"),
                1
        );
       /* System.out.println(grace.getMemberName() +
                ", " +
                grace.getMonths() +
                " months, $" +
                grace.getMonthlyPrice() +
                " with " +
                grace.getExtraMembers()+
                " extra members per month"
        );*/
       // System.out.println(grace);

      /*  System.out.println(emma.getMemberName() +
                ", " +
                emma.getMonths() +
                " months, $" +
                emma.getMonthlyPrice() +
                " with " +
                emma.getExtraMembers() +
                " extra members per month"
        );*/
       // System.out.println(emma);
/*
        System.out.println();
        System.out.println(" === Sign-up fee and contract total === ");
        System.out.println();

        System.out.println(henry.getMemberName() +
                " fee $" +
                henry.getSignUpFee() +
                ", total $" +
                henry.getContractTotal()
        );
        System.out.println(carol.getMemberName() +
                        " fee $" +
                        carol.getSignUpFee() +
                        ", total $" +
                        carol.getContractTotal()
        );

        System.out.println(frank.getMemberName() +
                        " fee $" +
                        frank.getSignUpFee() +
                        ", total $" +
                        frank.getContractTotal()
        );

        System.out.println(grace.getMemberName() +
                        " fee $" +
                        grace.getSignUpFee() +
                        ", total $" +
                        grace.getContractTotal()
        );*/
        ArrayList<Membership> memberships = new ArrayList<>();

        memberships.add(henry);
        memberships.add(alice);
        memberships.add(bob);
        memberships.add(carol);
        memberships.add(frank);
        memberships.add(grace);
        memberships.add(emma);

        BigDecimal income = new BigDecimal("0.00");
        BigDecimal contracts = new BigDecimal("0.00");

        for (Membership membership : memberships) {
            income = income.add(membership.getMonthlyPrice());
            contracts = contracts.add(membership.getContractTotal());
            print(membership);
        }
    }public static void print(Membership membership) {
        System.out.println("  Monthly price $" +
                membership.getMonthlyPrice() +
                ", signup fee  $" +
                membership.getSignUpFee() +
                ", contract total $" +
                membership.getContractTotal()
        );
    }
}
