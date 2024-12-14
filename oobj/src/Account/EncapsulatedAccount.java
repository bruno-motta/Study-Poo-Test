package Account;

public class EncapsulatedAccount { //classe
    private final String accountNumber;
    private final String accountOwner;
    private double balance;

    public EncapsulatedAccount(String accountNumber, String accountOwner, double balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public EncapsulatedAccount(String accountNumber){

        this(accountNumber, null,  0);
    }

    public EncapsulatedAccount(String accountNumber, double balance){

        this(accountNumber, null, balance);
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount){
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean deposit(String amount){
        return deposit(Double.parseDouble(amount));

    }

    public boolean withDraw(double amount){
        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void transfer(double amount, EncapsulatedAccount targetAccount){
        withDraw(amount);
        targetAccount.deposit(amount);

    }

    public void printBalance(){

        System.out.println("Balance: " + balance);
    }

}
