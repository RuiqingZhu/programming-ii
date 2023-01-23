package daycare;

import java.util.InputMismatchException;

public class Daycare {
    private String address;
    private String phoneNumber;
    private String name; //Daycare.name can be used by Classroom.className and Classroom.specialtyClassName


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Making sure phoneNumber contains exactly 10 digits
    public void setPhoneNumber(String phoneNumber) throws InputMismatchException {
        char[] chars = phoneNumber.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c) || chars.length != 10) {
                throw new InputMismatchException("Please enter a 10 digits phone number.");
            }
        }
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    //Making sure name has at least 2 characters
    public void setName(String name) throws InputMismatchException {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (chars.length < 2) {
                throw new InputMismatchException("Please enter a valid name with a minimum of 2 characters.");
            }
            this.name = name;
        }
    }
}

