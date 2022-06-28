package com.pjatk.bank;
import java.util.ArrayList;
import java.util.HashMap;
public class BankAccountManager {

    private HashMap<String, BankAccount> accounts = new HashMap<>();
    private HashMap<BankOperationType, ArrayList<BankAccountOperation>> operations = new HashMap<>();

    public void addAccount (BankAccount account){
        this.accounts.put(account.getAccountNumber(),account);
    }
    public void registerOperation(BankAccountOperation operation){
        if(!operations.containsKey(operation.getType())){
            operations.put(operation.getType(),new ArrayList<>());
        }
        ArrayList<BankAccountOperation> ops = operations.get(operation.getType());
        ops.add(operation);
    }
    public void performDeposits(){

        ArrayList<BankAccountOperation> ops = operations.get(BankOperationType.DEPOSIT);
        for (BankAccountOperation op:ops){
            op.getSourceBankAccount().addMoney(op.getMoney());
        }
    }
    public void performWithdrawals(){
        operations.get(BankOperationType.WITHDRAWAL).stream().forEach(ar -> {
            BankAccount per = ar.getSourceBankAccount();
            if (per.getCurrentMoney() >= ar.getMoney())
                ar.getSourceBankAccount().subtractMoney(ar.getMoney());
        });
    }
    public void performTransfers(){
        ArrayList<BankAccountOperation> ops = operations.get(BankOperationType.TRANSFER);
        for (BankAccountOperation op:ops){
            op.getSourceBankAccount().subtractMoney(op.getMoney());
            op.getTargetBankAccount().addMoney(op.getMoney());
        }
    }




}