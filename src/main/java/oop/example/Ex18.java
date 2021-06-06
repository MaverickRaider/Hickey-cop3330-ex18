
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;
import java.lang.Math;

public class Ex18 {
    public static void main(String[] args) {
        double result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TempCovert3000!");
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        String choice = scanner.nextLine();
        choice = choice.toUpperCase();
        System.out.println("Your choice: " + choice);

        if(choice.equals("C")){
            System.out.println("Please enter the temperature in Fahrenheit: ");
            double temp = scanner.nextDouble();
            result = (temp - 32);
            result = (result * 5 / 9);
            double roundedResult = Math.round(result * 100.0) / 100.0;
            System.out.println("The temperature in Celsius is " + roundedResult);
        }
        else if(choice.equals("F")){
            System.out.println("Please enter the temperature in Celsius: ");
            double temp = scanner.nextDouble();
            result = (temp * 9 / 5);
            result = (result + 32);
            double roundedResult = Math.round(result * 100.0) / 100.0;
            System.out.println("The temperature in Fahrenheit is " + roundedResult);
        }
        else{
            System.out.println("Invalid Choice.");
            System.exit(0);
        }
    }
}