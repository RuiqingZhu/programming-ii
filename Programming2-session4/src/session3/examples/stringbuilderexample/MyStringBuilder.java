package session3.examples.stringbuilderexample;

import java.util.Arrays;

public class MyStringBuilder {

    char[] values;

    public MyStringBuilder(){
        this("".toCharArray());
    }

    public MyStringBuilder(char[] chars){
        this.values = chars;
    }

    public MyStringBuilder(String s){
        this(s.toCharArray());
    }

    public MyStringBuilder insert(int offset, MyStringBuilder s) {
        return null;
    }

    public MyStringBuilder reverse(){
        return null;
    }

    public MyStringBuilder substring(int begin) {
        return null;
    }

    public MyStringBuilder toUpperCase() {
        String s = String.valueOf(values);
        String UC = s.toUpperCase();
        values = Arrays.copyOf(UC.toCharArray(), values.length);
        return this;
    }
}
