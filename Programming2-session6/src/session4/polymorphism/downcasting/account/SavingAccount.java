package session4.polymorphism.downcasting.account;

public class SavingAccount extends Account{
    public void showInfo(){
        System.out.println("This is an account");
    }

    public double getInterestRate(){
        return 2.3;
    }
}
