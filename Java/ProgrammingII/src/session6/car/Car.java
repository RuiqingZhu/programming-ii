package session6.car;
//Sorry couldn't complete all.

public class Car {
    private String makeModel;
    private int yearOfProd;
    private double engSizeL;

    public Car() {
    }

    //a constructor with all the fields

    public Car(String makeModel, int yearOfProd, double engSizeL) {
        this.makeModel = makeModel;
        this.yearOfProd = yearOfProd;
        this.engSizeL = engSizeL;
    }

    //getters and setters

    //year of production 1900 and 2100 other wise throw an error
    //The year of production must be between 1900 and 2100 "
    // "The make model cannot be less than 2 characters long."
    //"The engine size must be between 0 - 10 L.");
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        if(makeModel.length() >= 2) {
            this.makeModel = makeModel;
        }
        else {
            throw new StringIndexOutOfBoundsException("The make model cannot be less than 2 characters long");
        }
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) {
        if(yearOfProd >= 1900 && yearOfProd <= 2100) {
            this.yearOfProd = yearOfProd;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("The year of production must be between 1900 and 2100");
        }
    }

    public double getEngSizeL() {
        return engSizeL;
    }

    public void setEngSizeL(double engSizeL) {
        if(engSizeL > 0 && engSizeL <= 10) {
            this.engSizeL = engSizeL;
        }
        else {
            throw new IndexOutOfBoundsException("The engine size must be between 0 and 10 L");
        }
    }



    //toString
}
