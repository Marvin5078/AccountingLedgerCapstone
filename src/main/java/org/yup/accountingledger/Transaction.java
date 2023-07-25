package org.yup.accountingledger;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Transaction {

   private String description;
   private String vendor;
   private double amount;
   private boolean isDeposit;
   private LocalDateTime localDateTime;


    public Transaction(String description, String vendor, double amount, boolean isDeposit) {
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
        this.isDeposit = isDeposit;
        this.localDateTime = LocalDateTime.now();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setDeposit(boolean deposit) {
        isDeposit = deposit;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public boolean isDeposit() {
        return isDeposit;
    }

}
