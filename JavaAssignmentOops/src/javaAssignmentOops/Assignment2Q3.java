package javaAssignmentOops;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits;
    int creditLimit;

    public CurrentAccount(int totalDeposits, int creditLimit) {
        this.totalDeposits = totalDeposits;
        this.creditLimit = creditLimit;
    }

    //Override
    public int getCash() {
        return totalDeposits + creditLimit;
    }
}

class SavingsAccount extends Assignment2Q3 {
    int totalDeposits;
    int fixedDepositAmount;

    public SavingsAccount(int totalDeposits, int fixedDepositAmount) {
        this.totalDeposits = totalDeposits;
        this.fixedDepositAmount = fixedDepositAmount;
    }

    //Override
    public int getCash() {
        return totalDeposits + fixedDepositAmount;
    }
}

public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Assignment2Q3> cash) {
        int total = 0;
        for (Assignment2Q3 account : cash) {
            total += account.getCash();
        }
        return total;
    }

    public int getCash() {
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Assignment2Q3> cash = new ArrayList<>();
        cash.add(new CurrentAccount(10000, 2000));
        cash.add(new SavingsAccount(10000, 5000));

        Assignment2Q3 bank = new Assignment2Q3();
        int totalCash = bank.totalCashInBank(cash);
        System.out.println("Total cash in the bank: " + totalCash);
    }
}
