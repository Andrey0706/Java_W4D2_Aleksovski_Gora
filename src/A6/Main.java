package A6;

public class Main {
    public static void main(String[] args) {
        Bank commerzialBank = new Bank("Commerzialbank Mattersburg");
        commerzialBank.newCreditCardAccount("Masha Gessen");
        commerzialBank.newDebitCardAccount("Anne Applebaum");
        commerzialBank.withdrawMoney(1, 3000);
        commerzialBank.withdrawMoney(2, 3000);
        commerzialBank.balance(1);
        commerzialBank.balance(2);
        commerzialBank.withdrawMoney(1,600);
        commerzialBank.addMoney(1,100);
        commerzialBank.withdrawMoney(1,600);
    }
}
