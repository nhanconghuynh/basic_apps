package com.company;

/* a program to read three numbers, add them together and print their total.
 */

import java.util.Scanner;

public class Add_Three_Numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter first number: ");
        int n1 = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter second number: ");
        int n2 = reader.nextInt();
        System.out.println("Enter third number: ");
        int n3 = reader.nextInt();

        int n = 0;

        n = n1 + n2 + n3;

        System.out.println("Result is  " + n);
    }
}