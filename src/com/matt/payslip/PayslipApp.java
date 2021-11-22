package com.matt.payslip;

import java.util.Scanner;

public class PayslipApp {

    private static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the payslip generator!");
        System.out.println();

        System.out.print("Please input your name: ");
        String firstName = keyboardInput.nextLine();

        System.out.print("Please input your surname: ");
        String surname = keyboardInput.nextLine();

        System.out.print("Please enter your annual salary: ");
        double annualSalary = keyboardInput.nextDouble();

        System.out.print("Please enter your super rate: ");
        double superRate = keyboardInput.nextDouble();

        System.out.print("Please enter your payment start date: ");
        keyboardInput.nextLine();
        String paymentStartDate = keyboardInput.nextLine();

        System.out.print("Please enter your payment end date: ");
        String paymentEndDate = keyboardInput.nextLine();

        TaxCalculator taxCalculator = new TaxCalculator();

        int grossIncome = taxCalculator.calculateGrossIncome(annualSalary);
        int incomeTax = taxCalculator.calculateIncomeTax(annualSalary);
        int netIncome = grossIncome - incomeTax;

        System.out.println();
        System.out.println("Your payslip has been generated:");
        System.out.println();
        System.out.println("Name: " + firstName + " " + surname);
        System.out.println("Gross Income: " + grossIncome);
        System.out.println("Income tax: " + incomeTax);
        System.out.println("Net Income: " + netIncome);
        System.out.println();
        System.out.println("Thank you for using MYOB!");

    }

}
