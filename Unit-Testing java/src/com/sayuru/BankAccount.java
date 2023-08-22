package com.sayuru;

public class BankAccount {
    String firstName;
    String lastName;
    double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public double deposit(double amount,boolean branch){
        balance += amount;
        return balance;
    }
    public double widrawal(double amount,boolean branch){
        balance -= amount;
        return balance;
    }
    public double getBalance(){
        return balance;
    }
}
