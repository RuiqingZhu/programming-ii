package session5.example.arraylist;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
//        numbers[5] = 6;


        //nameofArrayList<Type of data-it needs to be a class type- that u save in the arraylist>
        ArrayList<Integer> arrayList = new ArrayList<>();
        //wrapper classes and autoboxing -> Integer int
        arrayList.add(23); // autoboxing happens implicitly
        arrayList.add(1);
        arrayList.add(2);

        arrayList.add(2, 50);
        Integer x = arrayList.get(2);

//        for(Integer element : arrayList){
//            System.out.println(element);
//        }

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person());
        personArrayList.add(new Person());
        personArrayList.add(new Person());
        personArrayList.add(new Person());

        //please create a class name User with username and password
        //use arraylist to save 3 use instance
        //loop into the arraylist and print the username and password
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("111", "*****"));
        userArrayList.add(new User("222", "&&&&"));
        userArrayList.add(new User("333", "!!!!!!"));

        for(User user:userArrayList){
            System.out.println(user.getUserName() + " " + user.getPassWord());
            System.out.println(user);
        }


        //gives a program that prompts the user to enter a sequence of numbers and
        //displays the distinct numbers in the sequence. Assume that the input ends with 0 and 0 is not
        //counted as a number in the sequence.
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers (ends with 0)");
        int value;
        do{
            value = scanner.nextInt();
            //I need to check if I already entered that number
            if(!list.contains(value) && value != 0){
                list.add(value);
            }
        }while (  value != 0);

        for(int i=0; i< list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for(Integer num : list){
            System.out.print(num + " ");
        }
    }
}
