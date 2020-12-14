package com.company.Assignment1;

public class BankAccount {
    private String name;
    private int id;
    private double balance;
    private int numTransactions;
    private double transactionFee = 0.50;

    //Constructors
    public BankAccount() {
        this.id = 0;
        this.balance = 0.0;
        this.name = "";
    }
    public BankAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    // Accessors and Mutator functions
    public void deposit(double amount) { //Adds amount to balance. Also counts as 1 transaction
        this.balance += (amount);
        numTransactions++;
    }
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            this.balance -= (amount);
            numTransactions++;
        } else {
            System.out.println("** Insufficient Balance **");
        }
    }
    public void deductMonthlyCharge() {
        final int freeTransactions = 10;//initializing free transactions as 10
        int max = Math.max(numTransactions, freeTransactions);
        if (max > freeTransactions) {
            this.balance -= (max - freeTransactions) * transactionFee;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}