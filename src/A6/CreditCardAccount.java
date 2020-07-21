package A6;

public class CreditCardAccount extends BankAccount {
    private double MAX_DEBIT;
    private double balance;

    public CreditCardAccount(String customer) {
        super(customer);
        this.MAX_DEBIT = -3500;
    }

    protected boolean canWithdraw(double amount) {
        return MAX_DEBIT < (balance - amount);
    }

    public double getMAX_DEBIT() {
        return MAX_DEBIT;
    }
}
