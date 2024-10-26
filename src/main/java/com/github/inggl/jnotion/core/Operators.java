package com.github.inggl.jnotion.core;

public class Operators {
    public static void main(String[] args) {
        // Casting
        int i = 5;

        // An int can be assigned to a long without explicit casting, as long type has a larger range
        long l = 10; // is a long

        // i is promoted to long for the addition, resulting in a long and the result is long.
        //int result = i + l;


        int result = i;
        // Compound operator implicitly casts l to long. It may lead to data loss if l exceeds Integer.MAX_VALUE.
        result += l; // 15

        System.out.println(null instanceof String); // always false!

        // instanceof cannot check against null
        //System.out.println((new Object()) instanceof null);
    }
}
