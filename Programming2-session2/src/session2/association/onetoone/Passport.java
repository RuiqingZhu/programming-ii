package session2.association.onetoone;

public class Passport {
    private String passportNumber;
    private String issuedCountry;

    public Passport(String passportNumber, String issuedCountry) {
        this.passportNumber = passportNumber;
        this.issuedCountry = issuedCountry;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getIssuedCountry() {
        return issuedCountry;
    }

    public void setIssuedCountry(String issuedCountry) {
        this.issuedCountry = issuedCountry;
    }
}
