package session4.polymorphism.downcasting.account;

public class CheckingAccount extends Account{
    public void showInfo(){
        System.out.println("This is an account");
    }

    public short getTransactionLimitForInterac(){
        return 1000;
    }
}
