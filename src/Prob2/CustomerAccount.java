package Prob2;

public class CustomerAccount {

    private String Cusname;
    private int AccNo;
    private double Balance;

    public CustomerAccount(String Cus_name, int Acc_No, double Balance) {
        this.Cusname = Cus_name;
        this.AccNo = Acc_No;
        this.Balance = Balance;
    }

    public boolean deposit(double amount) {

        if (amount < 0) {
            return false;
        }

        Balance = Balance + amount;

        return true;
    }

    public boolean withdraw(double amount) throws BalanceException {

        if (amount > Balance) {
            throw new BalanceException("Withdraw amount exceeds the balance.");
        }

        if (Balance - amount < 100) {
            throw new BalanceException("Balance cannot go below $100.");
        }

        Balance = Balance - amount;

        return true;
    }

    public double getBalance() {

        return Balance;
    }
}
