package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int hashNumber = 1;

             while (hashNumber <=10){
            System.out.println("Enter number #" + hashNumber + ": ");
            boolean userInt = scanner.hasNextInt();

            if (userInt) {
                int userInput = scanner.nextInt();
                scanner.nextLine();
                sum += userInput;

            } else {
                System.out.println("Invalid Number");
                break;
            }

            hashNumber++;

        }

        System.out.println(sum);

        scanner.close();


    }
}
