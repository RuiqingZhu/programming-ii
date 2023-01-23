package session4.polymorphism;

public class TestBank {
    public static void main(String[] args) {
        Double interestRate = null;
        //upcasting
        Bank bank1 = new RBCBank();
        interestRate = bank1.getInterestRate();
        Bank bank2 = new TDBank();
        interestRate = bank2.getInterestRate();
        Bank bank3 = new ScotiaBank();
        interestRate =bank3.getInterestRate();


        //Traditional way without polymorphism
//        RBCBank rbcBank = new RBCBank();
//        printInterestRateForRbc(rbcBank);
        Bank rbcBank = new RBCBank();
        printInterestRate(rbcBank);

//        TDBank tdBank = new TDBank();
//        printInterestRateForTD(tdBank);
        Bank tdBank = new TDBank();
        printInterestRate(tdBank);

//        ScotiaBank scotiaBank = new ScotiaBank();
//        printInterestRateForScotia(scotiaBank);
        Bank scotiaBank = new ScotiaBank();
        //Upcasting is not necessary and never fails !!!
        printInterestRate(scotiaBank);

    }

//    public static void printInterestRateForRbc(RBCBank bank){
//        System.out.println(bank.getInterestRate());
//    }
//
//    public static void printInterestRateForTD(TDBank bank){
//        System.out.println(bank.getInterestRate());
//    }
//
//    public static void printInterestRateForScotia(ScotiaBank bank){
//        System.out.println(bank.getInterestRate());
//    }

    /**
     * This method accepts a bank type and prints the interest rate
     * wrong -> this method can accept TD, RBC and scotia and Tangerine
     * @param bank
     */
    public static void printInterestRate(Bank bank){
        System.out.println(bank.getInterestRate());
    }

}
