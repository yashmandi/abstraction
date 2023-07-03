public class Current extends BankAcc {
    public Current (String accountNum, double balance) {
        super (accountNum, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of Rs." + amount + " is successful. Current Balance: Rs." + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Deposit of Rs." + amount + " is successful. Current Balance: Rs." + getBalance());
        } else {
        System.out.println("Insufficient Balance. Withdrawal failed!");
    }
    
}
}
