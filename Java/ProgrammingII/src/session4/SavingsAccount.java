package session4;

public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public double withDraw(double withdraw) {
        if (this.balance < 100) {
            return -1;
        } else {
            return this.balance = this.balance - withdraw;
        }
    }

    public String toString() {
        return "The ID:" + id + "\nThe balance is "
                + balance;

    }
}
