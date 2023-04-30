package org.yup.accountingledger;

import java.util.Scanner;

public class Transaction {
    private double balance;

    // lets make our methods: deposit & withdraw
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }


    //method that ask the users for info to either deposit or withdraw
    public void depositInfo() {

        Scanner scan = new Scanner(System.in);

        System.out.println("How much would you like to deposit?");
        double amount = scan.nextDouble();

        deposit(amount);
        System.out.println("Deposit successful.\n Your Current balance: " + balance);

    }

    public void withdrawInfo() {

        Scanner scan = new Scanner(System.in);

        System.out.println("How much would you like to withdraw");
        double amount = scan.nextDouble();

        withdraw(amount);
        System.out.println("Withdraw successful.\n Your Current balance: " + balance);

    }
}
