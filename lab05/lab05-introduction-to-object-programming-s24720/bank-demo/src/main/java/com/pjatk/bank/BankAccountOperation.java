package com.pjatk.bank;
import java.time.LocalDateTime;
import java.util.Calendar;

public class BankAccountOperation {
    private BankAccount sourceBankAccount;
    private BankAccount targetBankAccount;
    private double money;
    private LocalDateTime date;
    private BankOperationType type;

    public BankAccountOperation(BankOperationType type){
        this.type=type;
    }

    public BankAccount getSourceBankAccount() {
        return sourceBankAccount;
    }
    public void setSourceBankAccount(BankAccount sourceBankAccount) {
        this.sourceBankAccount = sourceBankAccount;
    }
    public BankAccount getTargetBankAccount() {
        return targetBankAccount;
    }
    public void setTargetBankAccount(BankAccount targetBankAccount) {
        this.targetBankAccount = targetBankAccount;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public double getMoney() {
        return money;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public com.pjatk.bank.BankOperationType getType() {
        return type;
    }

}