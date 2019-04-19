package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //prime number class opt.
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int num = 0;
        //Variable declaration
        String primeNumbers = "";
        String notPrime = "";
        System.out.println("Enter Number");
        int n = scanner.nextInt(); // capture user input
        scanner.close(); //closes addition input
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }

            }
            if (counter == 2) {
                System.out.println("This is prime" + i);
                primeNumbers = primeNumbers + i + " ";

            } else {
                System.out.println("This is not prime" + i);
                notPrime = notPrime + i + " ";


            }
        }
        //The following lines below are code i originally intended to implement for printing
        // unfortuantely these lines print results horizontally and in a continuous loop printing
    } }
//            System.out.println("Prime numbers from 1 to n are :");
//            System.out.println(primeNumbers);
//            System.out.println("none prime numbers from 1 to n are");
//            System.out.println(notPrime);}