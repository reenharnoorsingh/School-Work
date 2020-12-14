package com.company.Assignment1;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Harnoor Singh",111,400);
        System.out.println("Name: "+ba.getName());
        System.out.println("Bank ID: "+ba.getId());
        System.out.println("Current Balance: "+ba.getBalance());
        ba.deposit(100);
        ba.withdraw(50);
        ba.deposit(100);
        ba.withdraw(50);
        ba.deposit(100);
        ba.withdraw(50);
        ba.deposit(100);
        ba.withdraw(50);
        ba.deposit(100);
        ba.withdraw(50);
        ba.deposit(100);
        ba.withdraw(50);
        ba.deductMonthlyCharge();//deducts the balance after counting the number of transactions
        System.out.println("New Balance after transactions: "+ba.getBalance());
    }
}
