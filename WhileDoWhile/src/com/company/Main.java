package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        //while(condition)
        while(count != 6) {
            System.out.println("Count value is: " + count);
            count++;
        }

        // ==
        /*for (count=1; count!=6; count++) {
            System.out.println("Count value is: " + count);
        }*/


        count = 1;
        while (true) {
            if (count == 6)  {
                break;
            }
            System.out.println("Count value is: " + count);
            count++;
        }


        //do {} while (condition); executes once
        count = 6;
        do {
            System.out.println("Count value was: " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);


        int number = 4;
        int finishNumber = 20;
        int evenFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number: " + number);
            evenFound++;
            if (evenFound >= 5) {
                System.out.println("Even numbers found: " + evenFound);
                break;
            }
        }

        sumDigits(125);
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

   /* public static boolean isEvenNumber (int number) {
        while (true) {
            if (number % 2 == 0) {
                System.out.println("Even: " + number);
                return true;
            }
            System.out.println("Odd: " + number);
            return false;
        }
    }*/

    private static int sumDigits ( int number ) {

        if (number< 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Sum: " + sum);
        return sum;
    }
}
