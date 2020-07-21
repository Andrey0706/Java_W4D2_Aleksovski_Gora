package A6;

public class BankAccount {
    protected double MAX_DEBIT;
    protected String customer;
    protected double balance;

    public BankAccount(String customer) {
        this.customer = customer;
        balance = 0;
        MAX_DEBIT = 0;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) throws BankAcccountNegativeException {
        if (canWithdraw(amount)) {
            balance -= amount;
        } else {
            throw new BankAcccountNegativeException("Sorry " + customer + ", you are not eligible to withdraw " + amount + "€.");
        }
    }

    protected boolean canWithdraw(double amount) {
        return MAX_DEBIT < (balance - amount);
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMAX_DEBIT() {
        return MAX_DEBIT;
    }
}
