package A6;

public class CreditCardAccount extends BankAccount {

    public CreditCardAccount(String customer) {
        super(customer);
        super.MAX_DEBIT = -3500;
    }

}
