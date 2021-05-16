package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // '=' is the assigment operator while '==' is the Equals to operator

        int newValue = 50;
      //  if (newValue = 50){ // it found an int while it was looking for a boolean
      //      System.out.println("This is an error");
       // }

        if (newValue == 50){
            System.out.println("This is true");
        }

       /* boolean isCar = false;
        if (isCar = true){
            System.out.println("This is not supposed to happen");
        } */

        boolean isCar = false;
        if (isCar = true){ // (!isCar) to check if car is false
            System.out.println("This is not supposed to happen");
        }

    }
}
