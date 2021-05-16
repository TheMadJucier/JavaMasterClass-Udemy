package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int print1 = getEvendigitSum(123456789);
        System.out.println(print1);
        int print2 = getEvendigitSum(252);
        System.out.println(print2);
        int print3 = getEvendigitSum(-22);
        System.out.println(print3);
        int print4 = getEvendigitSum(0);
        System.out.println(print4);


    }

    public static int getEvendigitSum (int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            int sum = 0;
            int Digit = 0;
            for (int i = number; i != 0; i /= 10) {
                Digit = i % 10;
                if (Digit % 2 == 0) {
                    sum += Digit;
                } else {
                    continue;
                }

            }

            return sum;

         }

        //return sum;

    }






   /* Write a method named getEvenDigitSum with one parameter of type int called number.

    The method should return the sum of the even digits within the number.

    If the number is negative, the method should return -1 to indicate an invalid value.


    EXAMPLE INPUT/OUTPUT:

            * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

            * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

            * getEvenDigitSum(-22); → should return -1 since the number is negative


    NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.

    NOTE: Do not add a main method to the solution code.*/

    }