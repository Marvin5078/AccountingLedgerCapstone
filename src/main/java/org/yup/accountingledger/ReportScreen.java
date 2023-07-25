package org.yup.accountingledger;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ReportScreen {
    LedgerScreen ledgerScreen;
    private boolean reportRunning = true;

    public ArrayList<Transaction> myTransactions() {
        ArrayList<Transaction> myTransactions = ledgerScreen.getTransactions();

        return myTransactions;
    }

    public String displayReportScreen() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your Report Manager!\n");
        System.out.println("Press 1 for Month to Date");
        System.out.println("Press 2 for Previous Month");
        System.out.println("Press 3 for Year To Date");
        System.out.println("Press 4 for Previous Year");
        System.out.println("Press 5 to Search By Vendor");
        System.out.println("Press 0 to go back");
        System.out.println("Press H to go back to the home page");

        String userChoice = scanner.nextLine();

        return userChoice;
    }

    public void monthToDate() {
        for (Transaction transaction : myTransactions()) {
            if (transaction.getLocalDateTime().getMonth() == LocalDateTime.now().getMonth()) {
                System.out.println(transaction);
            }
        }
    }

    public void previousMonth() {
        for (Transaction transaction : myTransactions()) {
            if (transaction.getLocalDateTime().getMonth() == LocalDateTime.now().getMonth().minus(1)) {
                System.out.println(transaction);
            }
        }
    }

    public void yearToDate() {
        for (Transaction transaction : myTransactions()) {
            if (transaction.getLocalDateTime().getYear() == LocalDateTime.now().getYear()) {
                System.out.println(transaction);
            }
        }
    }

    public void previousYear() {
        for (Transaction transaction : myTransactions()) {
            if (transaction.getLocalDateTime().getYear() == (LocalDateTime.now().getYear() - 1)) {
                System.out.println(transaction);
            }
        }
    }

    public void searchByVendor() {
        Scanner scanner = new Scanner(System.in);
        String vendor = scanner.nextLine().toUpperCase();

        for (Transaction transaction : myTransactions()) {
            if (transaction.getVendor() == vendor) {
                System.out.println(transaction);
            }
        }
    }

    public void homePage() {
        System.out.println("Taking you back to the home page");

    }

    public void reportsInterface() {
            String userChoice = displayReportScreen();

            switch (userChoice) {
                case "1" -> monthToDate();
                case "2" -> previousMonth();
                case "3" -> yearToDate();
                case "4" -> previousYear();
                case "5" -> searchByVendor();
                case "0" -> ledgerScreen.ledgerInterface();
                case "H" -> homePage();
            }
        }
}
