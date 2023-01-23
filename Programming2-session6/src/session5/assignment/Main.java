package session5.assignment;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("6666666666", 500.0, 2.5f, new Date(999999999999L));
        Account account2 = new Account("6666666667", 600.0, 2.5f, new Date(899999999999L));
        System.out.println(account1);
        Account checkingAccount1 = new CheckingAccount(account1, 500);
        checkingAccount1.depositOrWithdraw(false, 1700);
        System.out.println(checkingAccount1);
        Account savingAccount1 = new SavingAccount(account2);
        savingAccount1.depositOrWithdraw(true,600);
        System.out.println(savingAccount1);

    }
}