package org.yup.accountingledger;

import java.util.ArrayList;

public class LedgerScreen {

    private ArrayList<Transaction> transactions;


    //probably should make a constructor
    public LedgerScreen(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }


    //need a method to display the ledger
    public void displayLedger() {

        System.out.println("Your Transaction history:");
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            System.out.println(transactions.toString());
        }

    }
}
