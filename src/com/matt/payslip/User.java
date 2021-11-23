package com.matt.payslip;

public class User {

    private String firstName;
    private String surname;
    private int annualSalary;
    private int superRate;
    private String paymentStartDate;
    private String paymentEndDate;

    public User(String firstName, String surname, int annualSalary, int superRate, String paymentStartDate, String paymentEndDate) {

        this.firstName = firstName;
        this.surname = surname;
        this.annualSalary = annualSalary;
        this.superRate = superRate;
        this.paymentStartDate = paymentStartDate;
        this.paymentEndDate = paymentEndDate;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public int getSuperRate() {
        return superRate;
    }

    public String getPaymentStartDate() {
        return paymentStartDate;
    }

    public String getPaymentEndDate() {
        return paymentEndDate;
    }
}
