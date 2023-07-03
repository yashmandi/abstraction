/* Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to
handle deposits and withdrawals for each account type. */

abstract class BankAcc {
    private String accountNum;
    private double balance;

public BankAcc(String accountNum, double balance) {
    this.accountNum = accountNum;
    this.balance = balance;
}


public String getAccountNum() {
    return accountNum;
}

public double getBalance() {
    return balance;
}

protected void setBalance(double balance) {
    this.balance = balance;
}

protected abstract void deposit (double amount);

protected abstract void withdraw (double amount);

}



