package org.yup.accountingledger;

import java.util.ArrayList;
import java.util.Scanner;

public class LedgerScreen {
    private ArrayList<Transaction> transactions;

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String displayLedgerScreen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to LedgerPro!\n");
        System.out.println("Press A to display all entries");
        System.out.println("Press D to display all deposits");
        System.out.println("Press W to display all withdrawals");
        System.out.println("Press R to view your reports");

        String userChoice = scanner.nextLine().toUpperCase();

        return userChoice;
    }

    public void displayMyDeposits(){
        System.out.println("Here are all your deposits: \n");
        for (Transaction transaction: transactions) {
            if (transaction.isDeposit() == true){
                System.out.println(transaction);
            }
        }
    }

    public void displayMyWithdrawals() {
        System.out.println("Here are all your withdrawals: \n");
        for (Transaction transaction:transactions){
            if (transaction.isDeposit() == false) {
                System.out.println(transaction);
            }
        }
    }

    public void displayAllEntries() {
        System.out.println("Here are all your transactions: \n");
        for (Transaction transaction:transactions) {
            System.out.println(transaction);
        }
    }

    public void viewReports() {
        ReportScreen reportScreen = new ReportScreen();
        reportScreen.reportsInterface();
    }

    public void ledgerInterface() {

       String userChoice = displayLedgerScreen();

        switch (userChoice) {
            case "A" -> displayAllEntries();
            case "D" -> displayMyDeposits();
            case "W" -> displayMyWithdrawals();
            case "R" -> viewReports();
        }
    }


}
