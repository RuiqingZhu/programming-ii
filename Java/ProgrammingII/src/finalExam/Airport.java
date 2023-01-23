package finalExam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airport {
    private String code;
    private String city;
    double latitude;
    double longitude;
    Date openingDate;

    public Airport(String code, String city, double latitude, double longitude, Date openingDate) {
        this.code = code;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.openingDate = openingDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) throws ParameterInvalidException {
        if(code.length() != 3) {
            throw new ParameterInvalidException("The airport code needs to be 3 characters!");
        }
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws ParameterInvalidException {
        char[] chars = city.toCharArray();
//        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if(Character.isDigit(c)) {
                throw new ParameterInvalidException("The city name cannot have any digits!");
            }
        }
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) throws ParameterInvalidException {
        if(latitude < -90 || latitude > 90) {
            throw new ParameterInvalidException("The latitude needs to be between -90 and 90!");
        }
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) throws ParameterInvalidException {
        if(longitude < -180 || longitude > 180) {
            throw new ParameterInvalidException("The longitude needs to be between -180 and 180!");
        }
        this.longitude = longitude;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) throws ParameterInvalidException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(openingDate.before(sdf.parse("1800-01-01")) || openingDate.after(sdf.parse("2100-12-31"))) {
            throw new ParameterInvalidException("The opening date needs to be between 1800 and 2100");
        }
        this.openingDate = openingDate;
    }

    public String toString() {
        return String.format("%s;%s;%.2f;%.2f;%s", this.code, this.city, this.latitude, this.longitude, this.openingDate);
    }
}
