package com.github.inggl.jnotion.core;

public class DataType {
    public static void main(String[] args) {
        boolean bool = false;

        // Integer cannot be assigned to boolean type
        // boolean bool = 0;

        byte b = 100;
        byte b1 = (byte) (127 + 21);
        System.out.println(b1); // -108

        // Out of range of byte -128 to 127
        //byte b1 = 300;
        //byte b1 = 127 + 21;

        short s = 100;
        int i = 100;

        // Long cannot be assigned to integer
        //int i = 100L;

        int i1 = 1_000_000;
        int i2 = 1____0;

        // Identifiers cannot start or end with an underscore
        //int i = _10;
        //int i = 10_;

        long l = 100L; // 100.0l
        long l1 = 100; // Promoting int to long

        //long l2 = 2983746129;
        long l2 = 2983746129L;

        float f = 100.0F; // 100.0f

        // Literals with decimal point are threaded as double by default
        // float f = 100.0;

        double d = 100.0; // 100.0
        double d1 = 1_0_0.0;

        // Underscore cannot be adjacent or precede the decimal point
        //double d = 100_.0;
        //double d = 100._0;

        char c = 'A';
        System.out.println(c); // A

        char c1 = 65;
        System.out.println(c1); // A

        char c2 = '\u0061';
        System.out.println(c2); // a

        char c3 = 'A';
        int ci = c3;
        System.out.println(ci); // 65

        // Wrapper classes
        Boolean aBoolean = Boolean.TRUE;
        System.out.println(aBoolean); // true

        aBoolean = Boolean.FALSE;
        System.out.println(aBoolean); // false

        Boolean nullBoolean = null;
        System.out.println(nullBoolean); // null

        // Primitive boolean has Boolean wrapper class
        // Bool aBoolean = Boolean.TRUE;

        System.out.println(Boolean.valueOf("true")); // true

        System.out.println(Boolean.valueOf("tRuE")); // true

        System.out.println(Boolean.valueOf("false")); // false

        System.out.println(Boolean.valueOf("abc")); // false

        System.out.println(Boolean.valueOf(null)); // false


        Integer aInteger = Integer.valueOf("10");
        System.out.println(aInteger); // 10

        // NumberFormatException
        //Integer.valueOf("abc");

        // NumberFormatException
        //Integer.valueOf(null);
    }
}
