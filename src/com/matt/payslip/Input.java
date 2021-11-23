package com.matt.payslip;

import java.util.Scanner;

public class Input {

    public User getUserInput() {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Welcome to the payslip generator!");
        System.out.println();

        System.out.print("Please input your first name: ");
        String firstName = keyboardInput.nextLine().trim();

        System.out.print("Please input your surname: ");
        String surname = keyboardInput.nextLine().trim();

        System.out.print("Please enter your annual salary: ");
        String annualSalaryString = keyboardInput.nextLine();
        while (!isInteger(annualSalaryString)) {
            System.out.print("Please enter your annual salary: ");
            annualSalaryString = keyboardInput.nextLine();
        }
        int annualSalary = Integer.parseInt(annualSalaryString);

        System.out.print("Please enter your super rate: ");
        String superRateString = keyboardInput.nextLine();
        while (!isInteger(superRateString)) {
            System.out.print("Please enter your super rate: ");
            superRateString = keyboardInput.nextLine();
        }
        int superRate = Integer.parseInt(superRateString);

        System.out.print("Please enter your payment start date: ");
        keyboardInput.nextLine();
        String paymentStartDate = keyboardInput.nextLine();

        System.out.print("Please enter your payment end date: ");
        String paymentEndDate = keyboardInput.nextLine();

        return new User(firstName, surname, annualSalary, superRate, paymentStartDate, paymentEndDate);

    }

    public boolean isInteger(String input) {

        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;

    }

}
