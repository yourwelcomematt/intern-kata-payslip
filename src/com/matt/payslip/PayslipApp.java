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
        System.out.println("Gross Income: " + grossIncome);

        int incomeTax = taxCalculator.calculateIncomeTax(annualSalary);
        System.out.println("Income tax: " + incomeTax);


    }

}
