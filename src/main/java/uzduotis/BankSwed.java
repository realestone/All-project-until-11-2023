package uzduotis;

public class BankSwed extends Bank {

    @Override
    public void addBankAccountFund(double amountToAdd) {
        super.setBankAccount(super.getBankAccount() + amountToAdd - (amountToAdd * super.getTaxRate() / 100));
    }


}
