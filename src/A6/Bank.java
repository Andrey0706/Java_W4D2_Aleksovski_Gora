package A6;

import java.util.HashMap;

public class Bank {
    private static int counter = 1;
    private final HashMap<Integer, BankAccount> customerList = new HashMap<>();
    private final String name;

    public Bank(String name) {
        this.name = name;
    }

    void newCreditCardAccount(String name) {
        customerList.put(counter++, new CreditCardAccount(name));
    }

    void newDebitCardAccount(String name) {
        customerList.put(counter++, new DebitCardAccount(name));
    }

    void newBankAccount(String name) {
        customerList.put(counter++, new BankAccount(name));
    }

    BankAccount getCustomer(int customerID) {
        return customerList.get(customerID);
    }

    void addMoney(int customerID, double amount) {
        getCustomer(customerID).addMoney(amount);
    }

    void withdrawMoney(int customerID, double amount) {
        try {
            getCustomer(customerID).withdrawMoney(amount);
        } catch (BankAcccountNegativeException e) {
            System.out.println(e.getMessage());
        }
    }

    void balance(int customerID) {
        System.out.println(getCustomer(customerID).getBalanceDetails());
    }
}
