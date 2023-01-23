package session2.arrayofobj;

import java.time.LocalDate;

public class Account {
    private final String accountNum;
    private final LocalDate openingDate;

    public Account(String accountNum, LocalDate openingDate) {
        this.accountNum = accountNum;
        this.openingDate = openingDate;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void test(){
        String accountNum = "tttttt"; //local variable
        System.out.println(accountNum + " compare to " + this.accountNum);

    }

}
