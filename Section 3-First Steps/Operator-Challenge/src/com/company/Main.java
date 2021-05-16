package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double myDouble = 20D;
        double mySecondDouble = 80d;
        double myDoubleSum = myDouble + mySecondDouble;

        double myRemainder = myDoubleSum % 40d;

        boolean myBool;
        if (myRemainder == 0){
            myBool = true;
            System.out.println("I have zero as a remainder");
        }
        else{
            myBool = false;
            System.out.println("I have some remainder");
        }

        System.out.println("The value of myBool  is " + myBool);




    }
}
