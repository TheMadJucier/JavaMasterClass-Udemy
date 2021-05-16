package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOVer = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

       /* if (score == 5000){
            System.out.println("Your score was 5000");
        }

        if (score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        }
        else {
            System.out.println("Got here!");
        }*/

        if (gameOVer == true){ // can be abbrievated to if(gameOVer)
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean newGameOver = true;
        int newScore = 800;
        int newLevelCompleted = 5;
        int newBonus = 100;

        if (newGameOver){
            int finalscore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalscore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOVer == true){ // can be abbrievated to if(gameOVer)
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
