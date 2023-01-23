package session4.polymorphism.downcasting.account;

public class Test {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        processAccount(checkingAccount);
        Account savingAccount = new SavingAccount();
        processAccount(savingAccount);

    }

    public static void processAccount(Account account){

        if (account instanceof CheckingAccount){
            CheckingAccount checkingAccount = (CheckingAccount) account;
            System.out.println(checkingAccount.getTransactionLimitForInterac());
        }
        if (account instanceof SavingAccount){
            SavingAccount savingAccount = (SavingAccount) account;
            System.out.println(savingAccount.getInterestRate());
        }

    }
}
