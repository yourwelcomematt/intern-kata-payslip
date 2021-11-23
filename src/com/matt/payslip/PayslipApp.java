package com.matt.payslip;

import java.util.Scanner;

public class PayslipApp {

    private static final Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {

        PayPeriodGenerator payPeriodGenerator = new PayPeriodGenerator();
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the payslip generator!");
        System.out.println();

        System.out.print("Please input your first name: ");
        String firstName = keyboardInput.nextLine();

        System.out.print("Please input your surname: ");
        String surname = keyboardInput.nextLine();

        System.out.print("Please enter your annual salary: ");
        int annualSalary = keyboardInput.nextInt();

        System.out.print("Please enter your super rate: ");
        int superRate = keyboardInput.nextInt();

        System.out.print("Please enter your payment start date: ");
        keyboardInput.nextLine();
        String paymentStartDate = keyboardInput.nextLine();
//        boolean validDate = payPeriodGenerator.validatePayPeriod(paymentStartDate);

        System.out.print("Please enter your payment end date: ");
        String paymentEndDate = keyboardInput.nextLine();
//        boolean isValid= payPeriodGenerator.validatePayPeriod(paymentEndDate);

        String payPeriodString = payPeriodGenerator.generatePayPeriod(paymentStartDate, paymentEndDate);
        int grossIncome = calculator.calculateGrossIncome(annualSalary);
        int incomeTax = calculator.calculateIncomeTax(annualSalary);
        int netIncome = grossIncome - incomeTax;
        int superAmount = calculator.calculateSuperAmount(grossIncome, superRate);

        System.out.println();
        System.out.println("Your payslip has been generated:");
        System.out.println();
        System.out.println("Name: " + firstName + " " + surname);
        System.out.println("Pay Period: " + payPeriodString);
        System.out.println("Gross Income: " + grossIncome);
        System.out.println("Income tax: " + incomeTax);
        System.out.println("Net Income: " + netIncome);
        System.out.println("Super: " + superAmount);
        System.out.println();
        System.out.println("Thank you for using MYOB!");

    }

}
