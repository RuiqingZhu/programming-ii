package session4;

public class TestAccount {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(2, 1000);
        savingsAccount.setBalance(100);
        savingsAccount.withDraw(95);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.getBalance();

        CheckingAccount checkingAccount = new CheckingAccount(1, 2000, 3000);
        checkingAccount.setOverDraftLimit(1500);
        checkingAccount.withDraw(500);
        System.out.println(checkingAccount.balance);
    }

}
