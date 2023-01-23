package session6.examples.chainedException;

public class Calculate {

    public void calculateSalary(){
        try {
            calculatePartTime();
        }catch (NumberFormatException numberFormatException){
            throw new NumberFormatException(numberFormatException.getMessage());
        }
    }

    public void calculatePartTime() throws NumberFormatException{
        try{
            calculateOverTime();
        }catch (NumberFormatException numberFormatException){
            throw new NumberFormatException(numberFormatException.getMessage());
//            throw numberFormatException;
        }
    }

    public void calculateOverTime() throws NumberFormatException{
        throw new NumberFormatException("the time is not valid");
    }
}
