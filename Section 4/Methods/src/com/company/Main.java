package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*boolean gameOVer = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;*/


        int highScore = calculateScore(true, 800, 5,100);
        System.out.println("Your final score was " + highScore);


       /* score = 10000;
        levelCompleted = 8;
        bonus = 200;
*/
        calculateScore(true, 10000, 8, 200);

        int highScorePostion = calculateHigh(1500);
        displayHighScorePosition("Tim ", highScorePostion);

        highScorePostion = calculateHigh(900);
        displayHighScorePosition("Bob ", highScorePostion);

        highScorePostion = calculateHigh(400);
        displayHighScorePosition("Percy ", highScorePostion);

        highScorePostion = calculateHigh(50);
        displayHighScorePosition("Jackson ", highScorePostion);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

            return finalScore;
        } else {
            return -1;
        }



    }

    public  static void displayHighScorePosition (String playerName, int postion){

        System.out.println(playerName + "managed to get into postion " +
                postion + " on the high score table");

    }

    public static int calculateHigh (int playerScore){
        /*if (playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500 ){
            return 2;
        }else if (playerScore >= 100 ){
            return 3;
        }
        return 4;*/

        int postion = 4; // assuming postion 4 will be returned

        if (playerScore >= 1000){
            postion = 1;
        }else if (playerScore >= 500){
            postion = 2;
        } else if (playerScore >= 100){
            postion = 3;
        }

        return postion;

    }

}
