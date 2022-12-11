package com.syntexpro.java.training;

import com.syntexpro.java.accessmodifiers.Hello;

import java.util.Arrays;

public class ArrayTopics {

    public static void main(String[] args) {



        // single dimension array
        int[] age = new int[6];
        age[0] = 20;
        age[1] = 5;
        age[2] = 7;
        age[3] = 8;
        age[4] = 100;
        age[5] = 10;

        //System.out.println(age[5]);

        String [] name = new String[6];
        name [1] = "Mehedi";
        name [0] = "Himo";


        // values = shirt, scarf, jacket, pant, ti
        //regular data storing;
        String item1 = "shirt";
        String item2 = "scarf";
        String item3 = "jacket";
        String item4 = "pant";
        String item5 = "ti";
        //System.out.println("Not elegant way: " + item2);

        // 2 way you can store data through array

        //rare
        //traditional way array:
        String [] itemss = new String[5];
        itemss[0] = "shirt";
        itemss[1] = "scarf";
        itemss[2] = "jacket";
        itemss[3] = "pant";
        itemss[4] = "ti";
        //itemss[5] = "coat";
        //System.out.println("traditional way array: " + itemss[2]);

        //best/new
        //modern way array: //0      1       2         3       4      5
        String[] items = {"shirt", "scarf", "pant", "jacket","ti", "coat"};

        //for each loop
        for (String item : items){
            System.out.println(item);
        }

        //System.out.println("modern way array: " + items[2]);

        int [] salary = {5, 10, 7, 9};
        //System.out.println(salary[3]);


    }
}
