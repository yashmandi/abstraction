public class Savings extends BankAcc {
    public Savings(String accountNum, double balance) {
        super(accountNum, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of Rs." + amount + " is successful.\nCurrent Balance: Rs." + getBalance());
    }

    @Override 
    public void withdraw(double amount) {
        if  (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of Rs. " + amount + " is successful.\nCurrent Balance: Rs." + getBalance());
        } else {
            System.out.println("Insufficient Funds. Withdrawal Failed.");
        }
    }
}
