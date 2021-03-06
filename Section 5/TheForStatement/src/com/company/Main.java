package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*System.out.println("10,000 at 2% imterest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% imterest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% imterest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% imterest = " + calculateInterest(10000.0, 5.0));*/

        // for(init;termination;increment)

       /* for (int i = 8;i > 2; i--){
            System.out.println("10,000 at " +i + "% interest = " +
                    "" + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        for (int i = 2; i < 8; i++){
            System.out.println("10,000 at " +i + "% interest = " +
                    "" + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }*/

        int count = 0;
        for (int i = 10; i < 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime (int n){
        if (n == 1){
            return false;
        }

        for (int i = 2;i <= (long) Math.sqrt(n); i++){
            System.out.println("Looping " + i);
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
