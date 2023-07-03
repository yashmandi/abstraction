public class BankAccCall {
    public static void main(String[] args) {
        double ibal, damt, wamt;

        ibal = 1000.0;
        Savings savingsAcc = new Savings("SA123", ibal);
        System.out.println("\nSavings Account initial balance: Rs." + ibal);
        
        damt = 500.0;
        savingsAcc.deposit(damt);

        wamt = 250.0;
        savingsAcc.withdraw(wamt);

        wamt = 1600.0;
        System.out.println("\nTry to withdraw: Rs." + wamt);
        savingsAcc.withdraw(wamt);



        System.out.println();
        System.out.println();
        ibal = 5000.0;
        Current currentAcc = new Current("CA123", ibal);
        System.out.println("Current Account initial balance: Rs." + ibal);

        damt = 2500.0;
        currentAcc.deposit(1000);

        wamt = 1250.0;
        currentAcc.withdraw(3000);

        wamt = 6000.0;
        System.out.println("\nTry to withdraw: Rs." + wamt);
        currentAcc.withdraw(wamt);
    }
}
