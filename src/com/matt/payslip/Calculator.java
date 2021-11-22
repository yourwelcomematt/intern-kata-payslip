package com.matt.payslip;

public class Calculator {

    public int calculateGrossIncome(int annualSalary) {

        double grossIncome = annualSalary / 12.0;
        return (int) Math.round(grossIncome);

    }

    public int calculateIncomeTax(int annualSalary) {

        double incomeTax;

        if (annualSalary >= 0 && annualSalary <= 18200) {
            return 0;
        }
        else if (annualSalary >= 18201 && annualSalary <= 37000) {
            incomeTax = ((annualSalary - 18200) * 0.19) / 12;
            return (int) Math.round(incomeTax);
        }
        else if (annualSalary >= 37001 && annualSalary <= 87000) {
            incomeTax = (3572 + (annualSalary - 37000) * 0.325) / 12;
            return (int) Math.round(incomeTax);
        }
        else if (annualSalary >= 87001 && annualSalary <= 180000) {
            incomeTax = (19822 + (annualSalary - 87000) * 0.37) /12;
            return (int) Math.round(incomeTax);
        }
        else {
            incomeTax = (54232 + (annualSalary - 180000) * 0.45) /12;
            return (int) Math.round(incomeTax);
        }

    }

    public int calculateSuperAmount(int grossIncome, int superRate) {

        double superAmount = (grossIncome * superRate) / 100.0;
        return (int) Math.round(superAmount);

    }

}
