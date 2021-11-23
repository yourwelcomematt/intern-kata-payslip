package com.matt.payslip;

import java.util.Scanner;

public class PayslipApp {

    private static final Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        PayPeriodGenerator payPeriodGenerator = new PayPeriodGenerator();
        Calculator calculator = new Calculator();

        User user = userInput.getUserInput();

        String payPeriodString = payPeriodGenerator.generatePayPeriod(user.getPaymentStartDate(), user.getPaymentEndDate());
        int grossIncome = calculator.calculateGrossIncome(user.getAnnualSalary());
        int incomeTax = calculator.calculateIncomeTax(user.getAnnualSalary());
        int netIncome = grossIncome - incomeTax;
        int superAmount = calculator.calculateSuperAmount(grossIncome, user.getSuperRate());

        System.out.println();
        System.out.println("Your payslip has been generated:");
        System.out.println();
        System.out.println("Name: " + user.getFirstName().trim() + " " + user.getSurname().trim());
        System.out.println("Pay Period: " + payPeriodString);
        System.out.println("Gross Income: " + grossIncome);
        System.out.println("Income tax: " + incomeTax);
        System.out.println("Net Income: " + netIncome);
        System.out.println("Super: " + superAmount);
        System.out.println();
        System.out.println("Thank you for using MYOB!");

    }

}
