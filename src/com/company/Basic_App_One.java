package com.company;

import java.util.Scanner;

public class Basic_App_One {
    public static void main(String[] args) {
        //basic application that will receive an integer from the user banging on the keyboard,
        // add 5 to it, double it, subtract 7 from it, and display the result to the screen.
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
        reader.close();
        n = n + 7;
        n = n * 2;
        n = n - 7;
        System.out.println("Result is  " + n);
    }
}
