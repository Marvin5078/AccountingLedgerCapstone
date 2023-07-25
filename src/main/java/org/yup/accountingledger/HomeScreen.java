package org.yup.accountingledger;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeScreen {
    LedgerScreen ledgerScreen = new LedgerScreen();
    private boolean running = true;

    //TODO: Could be 'public Transaction addDeposit()' if I need that
    public void addDeposit(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a description");
        String description = scanner.nextLine().toUpperCase();

        System.out.println("Enter the vendor");
        String vendor = scanner.nextLine().toUpperCase();

        scanner.nextLine();

        System.out.println("Enter the amount");
        double amount = scanner.nextDouble();

        ArrayList<Transaction> myTransactions = ledgerScreen.getTransactions();
        Transaction transaction = new Transaction(description,vendor,amount,true);
        myTransactions.add(transaction);

        System.out.println("Deposit transaction successfully added");
//        System.out.println("Description: " + transaction.getDescription() + "\n" +
//                "Vendor: " + transaction.getVendor() + "\n" +
//                "Amount: " + transaction.getAmount());

    }

    public void addWithdrawal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a description");
        String description = scanner.nextLine().toUpperCase();

        System.out.println("Enter the vendor");
        String vendor = scanner.nextLine().toUpperCase();

        scanner.nextLine();

        System.out.println("Enter the amount");
        double amount = scanner.nextDouble() * (-1);

        ArrayList<Transaction> myTransactions = ledgerScreen.getTransactions();
        Transaction transaction = new Transaction(description,vendor,amount, false);
        myTransactions.add(transaction);

        System.out.println("Withdrawal transaction successfully added");
//        System.out.println(
//                "Description: " + description + "\n" +
//                "Vendor: " + vendor + "\n" +
//                "Amount: " + amount
//        );

    }

    public void displayLedger(){
        LedgerScreen ledgerScreen = new LedgerScreen();
        ledgerScreen.ledgerInterface();
    }

    public void exitApp() {
        running = false;
        System.out.println("Thank you for using Big Money Bank mobile app!\n"
                + "Now exiting the application...");
    }

    public String displayHomeScreen() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome Home " + name + "!\n");
        System.out.println("Press D to add a deposit");
        System.out.println("Press P to add a withdrawal");
        System.out.println("Press L to enter LedgerPro");
        System.out.println("Press X to exit the app");

        String userChoice = scanner.nextLine().toUpperCase();

        return userChoice;
    }

    public void homeScreenInterface() {
        String userChoice = displayHomeScreen();
        switch (userChoice) {
            case "D" -> addDeposit();
            case "P" -> addWithdrawal();
            case "L" -> displayLedger();
            case "X" -> exitApp();
        }

    }

    public void runApp() {
        while (running == true) {
            homeScreenInterface();
        }
        //I question if this is where it needs to be.
        // running is already declared true.
        //honestly probably don't even need this method.
    }


}
