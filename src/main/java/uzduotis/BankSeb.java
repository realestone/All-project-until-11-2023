package uzduotis;

public class BankSeb extends Bank {


    @Override
    public void addBankAccountFund(double amountToAdd) {
        super.setBankAccount(super.getBankAccount() + amountToAdd - (amountToAdd * super.getTaxRate() / 100));
    }

}
