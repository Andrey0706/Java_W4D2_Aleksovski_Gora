package A6;

public class DebitCardAccount extends BankAccount {
    private double MAX_DEBIT;
    private double balance;

    public DebitCardAccount(String customer) {
        super(customer);
        this.MAX_DEBIT = 0;
    }

    protected boolean canWithdraw(double amount) {
        return MAX_DEBIT < (balance - amount);
    }

    public double getMAX_DEBIT() {
        return MAX_DEBIT;
    }
}
