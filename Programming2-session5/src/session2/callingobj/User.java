package session2.callingobj;

public class User {
    private String userName;
    private String passWord;

    public User(String userName, String passWord) {
        setUserName(userName);
        setPassWord(passWord);
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
