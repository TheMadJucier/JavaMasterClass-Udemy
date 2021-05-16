package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int topScore = 100;
        if (topScore != 100){
            System.out.println(" You got the high score!");
        }if (topScore >= 100){
            System.out.println(" You got the high score! (2)");
        }
        if (topScore < 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        topScore = 80;

        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

    }
}
