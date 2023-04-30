package org.yup.accountingledger;

import java.util.Scanner;

public class Transaction {

   private String description;
   private String vendor;
   private double amount;
   private double balance;
   private boolean isDeposit;


    public Transaction(String description, String vendor, double amount) {
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
        this.balance = balance;
    }

    public boolean isDeposit() {
        return isDeposit;
    }

    public String toString() {
        String type;
        if(isDeposit) {
            type = "Deposit";
        }else {
            type = "Withdrawal";
        }
        return type + " - " + description + " - " + amount;
    }

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
