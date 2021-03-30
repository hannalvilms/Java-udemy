package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; //1+2=3
        System.out.println("1 + 2 = " + result);

        int prevResult = result;//3-1=2
        System.out.println("prevResult = " + prevResult);

        result = result - 1;
        System.out.println("3 + 1 = " + result);

        result = result * 10; // 2*10=20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20*5=4
        System.out.println("20 * 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        //result = result + 1
        result++; //1+1 =2
        System.out.println(result);

        //result = result - 1
        result--;
        System.out.println(result);

        //result = result + 2
        result += 2; //1 + 2 = 3;
        System.out.println(result);

        //result = result * 10 = 30
        result *= 10;
        System.out.println(result);

        //result = result / 3 = 10
        result /= 3;
        System.out.println(result);

        //result = result - 2 = 8
        result -= 2;
        System.out.println(result);

        boolean isAlien = false;
        if (!isAlien) { //isAlien == false //no semicolon
            System.out.println("It is not an alien!");
            System.out.println("And im scared.");
        }

        int topScore = 80;
        if (topScore < 100) { // ==, !=, >, >=, <, <=
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) { //and
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) { //or
            System.out.println("Either one or both of the conditions are true");
        }

        int newValue = 50;
        if( newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        //Ternary operator ?:
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        //challenge

        double first = 20.00d;
        double second = 80.00d;
        double sum = (first + second) * 100.00d;
        System.out.println("Sum: " + sum);
        double remainder = sum % 40.00d;
        System.out.println("Remainder: " + remainder);
        boolean assignValue = (remainder == 0) ? true : false;
        System.out.println(assignValue);
        if (assignValue != true) {
            System.out.println("Got some remainder");
        }
    }
}
