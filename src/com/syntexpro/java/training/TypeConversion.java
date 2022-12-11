package com.syntexpro.java.training;

public class TypeConversion {

    public static void main(String[] args) {


        // Widening - implicit
        short a = 50; //16 bits
        //int b = a;
        double c = a; //64 bits

        //System.out.println(c);

        //Narrowing --- explicit /type/data casting (int)
        double d = 5.2;  //64 bits

        int e = (int)d;  //32 bits
        //System.out.println(e);

        long h = 100;
        byte k = (byte) h;
        System.out.println(k);







    }

}
