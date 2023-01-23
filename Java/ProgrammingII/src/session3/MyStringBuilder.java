package session3;

import java.util.Arrays;

public class MyStringBuilder {

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


    char[] values;

    public MyStringBuilder() {
        this("".toCharArray());
    }

    public MyStringBuilder(char[] chars) {
        this.values = chars;
    }

    public MyStringBuilder(String s) {
        this(s.toCharArray());
    }

    public MyStringBuilder insert(int offset, MyStringBuilder s) {
        return null;
    }

    public MyStringBuilder revers() {
        return null;
    }

    public MyStringBuilder substring(int begin) {
        return null;
    }

    public MyStringBuilder toUpperCase() {
        String s = String.valueOf(values);
        String UC = s.toUpperCase();
        values = Arrays.copyOf(UC.toCharArray(), values.length);
        return null;
    }
}
