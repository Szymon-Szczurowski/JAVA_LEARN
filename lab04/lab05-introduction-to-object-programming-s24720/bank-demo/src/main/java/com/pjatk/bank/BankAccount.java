package com.pjatk.bank;
public class BankAccount {

    private String accountNumber;
    private double currentMoney;
    public BankAccount(String accountNumber1) {

    }


    public String getAccountNumber(){
        return accountNumber;
    }

    public double getCurrentMoney(){
        return currentMoney;
    }

    public void addMoney(double value){
        this.currentMoney += value;
    }

    public void subtractMoney(double value){
        this.currentMoney -= value;
    }


}