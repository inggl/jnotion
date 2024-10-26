package com.github.inggl.jnotion.core;

public class Strings {
    public static void main(String[] args) {
        /*
        * String
        * */
        String s = "";
        String aString = new String();

        // Text block
        String textBlock = """
                    A \
                    B \
                    C \s
                    D
                    E
                    """;  // A B C\n D\n E\n

        // Text block cannot be empty
        //String textBlock = """""";

        // String Pool
        String s1 = "aBcd";
        String s2 = "aBcd";

        System.out.println(s1 == s2); // true

        System.out.println(s1.equals(s2)); // true

        // String reference
        String s3 = new String("b");
        String s4 = new String("b");

        System.out.println(s3 == s4); // false

        System.out.println(s3.equals(s4)); // true

        // Methods
        System.out.println(s1.toLowerCase()); // abcd

        System.out.println(s1.toUpperCase()); // ABCD

        System.out.println(s1.charAt(0)); // a

        System.out.println(s1.charAt(1)); // B

        // StringIndexOutOfBoundsException
        //s1.charAt(5)

        /*
        * String Builder
        * */
        StringBuilder sb = new StringBuilder();

        sb.append(1);
        System.out.println(sb); // 1

        sb.insert(0, 2);
        System.out.println(sb); // 21

        System.out.println(new StringBuilder().insert(0, 1)); // 1
    }
}
