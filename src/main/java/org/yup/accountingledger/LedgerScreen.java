package org.yup.accountingledger;

import java.util.ArrayList;

public class LedgerScreen {

    private ArrayList<Transaction> transactions;


    //probably should make a constructor
    public LedgerScreen() {
        this.transactions = transactions;
    }


    //need methods to display the ledger(incl. Deposits & Withdrawals)
    public void displayLedger() {

        System.out.println("Transaction history:");
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            System.out.println(transactions.toString());
        }

    }

    public void displayDeposits() {

        System.out.println("Deposit history: ");;
        for (Transaction transaction : transactions) {

            if(transaction.isDeposit()) {
                System.out.println(transaction.toString());
            }
        }
    }

    public void displayWithdrawals() {
        System.out.println("Withdrawl history: ");
        for (Transaction transaction : transactions) {

            if (!transaction.isDeposit()) {
                System.out.println(transaction.toString());
            }
        }
    }

}
