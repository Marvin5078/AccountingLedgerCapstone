package org.yup.accountingledger;

import java.util.ArrayList;

public class HomeScreen {

    private boolean running = true;

    public void exitApp() {
        running = false;
        System.out.println("Thank you for using Big Money Bank mobile app!\n"
        + "Now exiting the application...");
    }

    public void runApp() {
        while (running) {

            LedgerScreen ledgerScreen = new LedgerScreen();




            //need to put main application logic here

        }
        System.out.println("Goodbye!");
    }


}
