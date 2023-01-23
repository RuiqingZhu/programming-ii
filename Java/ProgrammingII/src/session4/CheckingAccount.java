package session4;

public class CheckingAccount extends Account {

    private double OverDraftLimit;

    public CheckingAccount(int id, double balance, double OverdraftLimit) {

        super(id, balance);

        this.OverDraftLimit = OverDraftLimit;
    }

    public double getOverDraftLimit() {
        return OverDraftLimit;
    }

    public void setOverDraftLimit(double OverDraftLimit) {
        this.OverDraftLimit = OverDraftLimit;
    }

    @Override
    public double withDraw(double withdraw) {

        if (getOverDraftLimit() != 0) {

            if (this.balance < 100) {

                this.balance = this.balance + this.OverDraftLimit;

                setOverDraftLimit(0);

                return this.balance = this.balance - withdraw;
            } else {
                return this.balance = this.balance - withdraw;
            }

        } else if (getOverDraftLimit() == 0) {
            if (this.balance < 100) {
                return -1;
            } else {
                return this.balance = this.balance - withdraw;
            }
        }

        return this.balance;
    }

    public String toString() {
        return "The ID:" + id + "\nThe balance is "
                + balance + "\nThe overdraft limit is：" + getOverDraftLimit();

    }
}
