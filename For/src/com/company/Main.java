package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0, 2.0));

       // for(init; termination; increment)
        for(int i=2; i < 9; i++) {
            System.out.println("10.000 at " + i +"% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("*****");

        for(int i=8; i >= 2; i--) {
            System.out.println("10.000 at " + i +"% interest = " + calculateInterest(10000.0, i));
        }

        int count = 0;
        for (int i=10; i<50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }

        int countTwo = 0;
        int sum = 0;

        for (int i=1; i<=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                countTwo++;
                sum += i;
                System.out.println("Found number: " + i);
                if (countTwo == 5) {
                    System.out.println("Sum: " + sum);
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }
}
