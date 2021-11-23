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
        int annualSalary = keyboardInput.nextInt();

        System.out.print("Please enter your super rate: ");
        int superRate = keyboardInput.nextInt();

        System.out.print("Please enter your payment start date: ");
        keyboardInput.nextLine();
        String paymentStartDate = keyboardInput.nextLine();

        System.out.print("Please enter your payment end date: ");
        String paymentEndDate = keyboardInput.nextLine();

        return new User(firstName, surname, annualSalary, superRate, paymentStartDate, paymentEndDate);

    }

}
