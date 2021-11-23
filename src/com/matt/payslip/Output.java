package com.matt.payslip;

public class Output {

    public void generatePayslip(String fullName, String payPeriodString, int grossIncome, int incomeTax, int netIncome, int superAmount) {

        System.out.println();
        System.out.println("Your payslip has been generated:");
        System.out.println();
        System.out.println("Name: " + fullName);
        System.out.println("Pay Period: " + payPeriodString);
        System.out.println("Gross Income: " + grossIncome);
        System.out.println("Income tax: " + incomeTax);
        System.out.println("Net Income: " + netIncome);
        System.out.println("Super: " + superAmount);
        System.out.println();
        System.out.println("Thank you for using MYOB!");

    }

}
