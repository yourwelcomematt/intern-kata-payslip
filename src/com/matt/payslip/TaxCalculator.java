package com.matt.payslip;

public class TaxCalculator {

    public int calculateGrossIncome(double annualSalary) {

        double grossIncome = annualSalary / 12.0;
        return (int) Math.round(grossIncome);

    }

}
