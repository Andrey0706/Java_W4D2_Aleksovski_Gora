package A6;

public class Main {
    public static void main(String[] args) {
        DebitCardAccount dc1 = new DebitCardAccount("Masha Gessen");
        CreditCardAccount cc1 = new CreditCardAccount("Anne Applebaum");
        try {
            dc1.withdrawMoney(3000);
        } catch (BankAcccountNegativeException e) {
            System.out.println(e.getMessage());
        }
        try {
            cc1.withdrawMoney(3000);
        } catch (BankAcccountNegativeException e) {
            System.out.println(e.getMessage());
        }
        try {
            dc1.withdrawMoney(600);
        } catch (BankAcccountNegativeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(dc1.getMAX_DEBIT());
        System.out.println(cc1.getMAX_DEBIT());

    }
}
