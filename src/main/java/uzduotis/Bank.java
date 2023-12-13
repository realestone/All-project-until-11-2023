package uzduotis;

import lombok.Data;

@Data
public abstract class Bank {

    private String name;
    private double taxRate;
    private double bankAccount;

    public abstract void addBankAccountFund(double amountToAdd);





}
