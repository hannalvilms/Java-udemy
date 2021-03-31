package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(2);
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break; //breaks are important!!!

            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5: {
                System.out.println("Value was " + switchValue);
                break;
            }
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        char switchChar = 'B';

        switch (switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found");
                break;

            default:
                System.out.println("Value A, B, C, D or E was not found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }
    }

    private static void printDayOfTheWeek (int day) {
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
