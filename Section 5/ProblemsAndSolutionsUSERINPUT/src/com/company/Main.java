package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        calcAgeWithYearOfBirth();

    }

    public static void calcAgeWithYearOfBirth (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year if birth: ");
        boolean hasNextInt = scanner.hasNextInt(); // checks to see if the user has entered an integer

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt(); // handles next line character
            scanner.nextLine();// handles n

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else{
                System.out.println("Invalid Year of Birth");
            }


            scanner.close();
        } else {
            System.out.println("Unable to parse the year of birth");
        }


    }

}
