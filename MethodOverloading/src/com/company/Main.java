package com.company;

public class Main {

    public static void main(String[] args) {
	int newScore = calculateScore("Hanna", 200);
        System.out.println("New score is " + newScore);
        calculateScore(300);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeters < 0.0){
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(156);
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(90));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player scored no points.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 0))) {
            System.out.println("invalid");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " +centimeters+ "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = inches / 12;
        double remainingInches =  (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    private static String getDurationString (long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + " h " + remainingMinutes + " m " + seconds + " s";
    }

    private static String getDurationString (long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

}
