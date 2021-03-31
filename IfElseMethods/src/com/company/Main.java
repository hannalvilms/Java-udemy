package com.company;

public class Main {

    public static void main(String[] args) {
        //if keyword and code blocks

        calculateScore(true, 800, 5, 100);
        int highScore = calculateScoreTwo(true, 10000, 8, 200);
        System.out.println("Your finals score was " + highScore);


        int highScoreposition = calculateHighScorePosition(1000);
        displayHighScorePosition("Hanna", highScoreposition);

        highScoreposition = calculateHighScorePosition(900);
        displayHighScorePosition("Kris", highScoreposition);

        highScoreposition = calculateHighScorePosition(400);
        displayHighScorePosition("Vichy", highScoreposition);

        highScoreposition = calculateHighScorePosition(50);
        displayHighScorePosition("Lucy", highScoreposition);
    }

    //Method CalculateScore
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) { //gameover == true
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " +
                position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }

    //return int
    public static int calculateScoreTwo(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) { //gameover == true
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1; //error, value not found
    }
}
