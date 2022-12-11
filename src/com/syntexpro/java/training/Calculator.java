package com.syntexpro.java.training;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my Syntexpro Calculator");

        System.out.println("Enter a number");
        int number1 = input.nextInt();

        System.out.println("Enter another number");
        int number2 = input.nextInt();

        int result = number1 + number2;
        System.out.println("Final result = " + result);
    }




}
