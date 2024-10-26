package com.github.inggl.jnotion.core;

public class Variable {
    public static void main(String[] args) {
        byte $ = 1;
        int € = 1;
        int £ = 1;

        // Using single underscore alone is illegal
        //byte _ = 1;

        byte b_ = 1;
        byte _b = 1;

        // Reserved keyword
        //byte case = 1;

        // Keyword var is not reserved
        var var = 1;

        // Local variable type inference must be initialized
        //var x; // Doesn't compile.

        // Local variable type inference cannot be used in declaration with more than one variable
        //var x = 5, y = 6;

        // Local variable must be initialized before usage.
        int a;
        //System.out.println(a);
    }
}
