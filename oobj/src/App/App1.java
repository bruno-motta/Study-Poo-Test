package App;

import Account.Account;
import Account.SavingsAccount;

public class App1 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setOwner("Bruno");
        a1.setNumber("12345");
        a1.setBalance(1000);
        a1.print();

        SavingsAccount a2 = new SavingsAccount();
        a2.setOwner("Pedro");
        a2.setNumber("15484");
        a2.setBalance(500);
        a2.print();



    }
}
