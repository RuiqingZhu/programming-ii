package session3.examples.stringbuilderexample;

public class Example {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("JAC");
        builder.append(" Students");

        MyStringBuilder myStringBuilder = new MyStringBuilder();


        StringBuffer buffer = new StringBuffer();
        System.out.println(builder);

//        String s = new String("KFC");
//        s = s.concat(" chicken");
//        System.out.println(s);
    }
}
