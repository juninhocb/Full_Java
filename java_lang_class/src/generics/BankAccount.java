package generics;

import generics.interfaces.TaxService;

public class BankAccount {

    private double balance;
    private final int accountNumber;
    private static int lastAssignedNumber;
    private static final int BANK_CODE = 123;
    private final TaxService taxService;

    BankAccount(TaxService taxService){
        System.out.println("Constructor block");
        this.accountNumber = this.lastAssignedNumber;
        this.lastAssignedNumber++;
        this.balance = 0;
        this.taxService = taxService;
    }

    {System.out.println("Initializer block");; }


    public void depositAmount (double amount){
        double tax = taxService.taxCalculator(amount);
        System.out.println(String.format("You will be taxed by %.2f", tax));
        double taxedAmount = amount - tax;
        this.balance += taxedAmount;
    }

    public double getBalance(){
        return this.balance;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", lastAssignedNumber=" + lastAssignedNumber +
                ", BANK_CODE=" + BANK_CODE +
                '}';
    }
}
