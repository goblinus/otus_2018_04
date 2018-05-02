package ru.otus;

//import com.google.common.io.LineReader;

public class ByteCodeExample {
    private final String name;

    public ByteCodeExample(String name) {
        this.name = name;
    }

    public static void main (String []args) {
        String name = "Tully";
        ByteCodeExample example = new ByteCodeExample(name);
        long size = example.getAnswer();
        System.out.println("The answer for " + example.name + " is: " + size);
    }

    public long getAnswer() {
        int a = 1;
        int b = 5;
        int c = a << b;
        return c + 10;
    }
}
