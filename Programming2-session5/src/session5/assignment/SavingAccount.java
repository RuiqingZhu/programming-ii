package session5.assignment;

public class SavingAccount extends Account {

    public SavingAccount() {
    }

    public SavingAccount(Account account) {
        super(account.getAccountNumber(), account.getBalance(), account.getInterestRate(), account.getDateCreated());
    }

    @Override
    public void depositOrWithdraw(boolean deposit, double amount) {
        double tempBalance;
        if (deposit) {
            tempBalance = getBalance() + amount;
            setBalance(tempBalance);
        } else {
            tempBalance = getBalance() - amount;
            if (tempBalance < 0) {
                System.out.println("This account cant be overdraft\n");
            } else {
                setBalance(tempBalance);
            }
        }
    }
}
