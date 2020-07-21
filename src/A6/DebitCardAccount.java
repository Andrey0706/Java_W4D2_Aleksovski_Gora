package A6;

public class DebitCardAccount extends BankAccount {

    public DebitCardAccount(String customer) {
        super(customer);
        super.MAX_DEBIT = 0;
    }
}
