package session5.assignment;

public class CheckingAccount extends Account {
    private int overdraftLimit;

    public CheckingAccount(Account account, int overdraftLimit) {
        super(account.getAccountNumber(), account.getBalance(), account.getInterestRate(), account.getDateCreated());
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void depositOrWithdraw(boolean deposit, double amount) {
        double tempBalance;
        if (deposit) {
            tempBalance = getBalance() + amount;
            setBalance(tempBalance);
        } else {
            tempBalance = getBalance() - amount;
            if (tempBalance < (-overdraftLimit)) {
                System.out.println("over overdraft\nThe transaction is failed\n");
            } else {
                setBalance(tempBalance);
            }
        }
    }
}
