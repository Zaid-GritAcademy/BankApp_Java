package com.grit;

import javax.swing.*;

public class Account {
    // State
    private int saldo;
    private String accountType = "DebitAccount";
    private int accountNumber = 1000;

    // Behavior
    // Constructor
    public Account(int saldo, String accountType, int accountNumber) {
        this.saldo = saldo;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    // Getters
    public int getSaldo() {
        return saldo;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Methods
    public int Deposit(Long personNumber, int amount){
        saldo = saldo + amount;
        return saldo;
    }
    public int withdraw(Long personNumber, int amount){
        if (saldo >= amount){
            saldo = saldo - amount;
        }else{
            JOptionPane.showMessageDialog(null, "You do not have enough money in your account!");
        }
        return saldo;
    }

}
