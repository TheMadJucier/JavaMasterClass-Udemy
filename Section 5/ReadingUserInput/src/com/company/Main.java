package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year if birth: ");
        int yearOfBirth = scanner.nextInt(); // handles next line character
        scanner.nextLine();// handles n

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2020 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();

    }


}
