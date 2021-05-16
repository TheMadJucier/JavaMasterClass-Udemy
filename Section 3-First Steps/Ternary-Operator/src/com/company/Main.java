package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean isCar = false;

        isCar = true;
        boolean wasCar = isCar ? true : false; // conditon ? value to assgin if value is true : value to assign if first operand conditon was false

        if (wasCar){
            System.out.println("wasCAr is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        System.out.println(" Our age of Client is " + isEighteenOrOver);

    }
}
