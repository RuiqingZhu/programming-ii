package session2.callingobj;

public class UserManagement {
    public static void main(String[] args) {
        User user = new User("test", "test123");
        printUser(user);
        modifyUserNamePassword(user); //CALL BY REFERENCE
        printUser(user);

        int number = 10;
        System.out.println(number); // CALL BY VALUE
        changeNumber(10);
        System.out.println(number);
    }

    public static void printUser(User userObj){
        System.out.println(userObj.getUserName() + " " + userObj.getPassWord());
    }

    public static void modifyUserNamePassword(User userObj){
        userObj.setUserName( "****************" + userObj.getUserName() + "****************");
        userObj.setPassWord( "****************" + userObj.getPassWord() +  "****************");
    }

    public static void changeNumber(int num){
        num = num * 10;
    }
}
