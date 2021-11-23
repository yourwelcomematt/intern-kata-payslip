package com.matt.payslip;

public class PayslipApp {

    public static void main(String[] args) {

        Input input = new Input();
        Output output = new Output();
        PayPeriodGenerator payPeriodGenerator = new PayPeriodGenerator();
        Calculator calculator = new Calculator();

        User user = input.getUserInput();

        String fullName = user.getFirstName() + " " + user.getSurname();
        String payPeriodString = payPeriodGenerator.generatePayPeriod(user.getPaymentStartDate(), user.getPaymentEndDate());
        int grossIncome = calculator.calculateGrossIncome(user.getAnnualSalary());
        int incomeTax = calculator.calculateIncomeTax(user.getAnnualSalary());
        int netIncome = grossIncome - incomeTax;
        int superAmount = calculator.calculateSuperAmount(grossIncome, user.getSuperRate());

        output.generatePayslip(fullName, payPeriodString, grossIncome, incomeTax, netIncome, superAmount);

    }

}
