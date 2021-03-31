package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Parsing values from a string
        /*String numberAsString = "2018.12";
        System.out.println("numberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number: " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);
        System.out.println(number);*/

        Scanner scanner = new Scanner (System.in);

       /* System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line char

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth!");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();*/


        //challenge


        int counter = 0;
        int sum = 0;

       // while (true) {
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
              //  if (counter == 10)
              //    break;
              //  }
            } else {
                System.out.println("Invalid number!");
            }
            System.out.println("sum = " + sum);
            scanner.nextLine(); // handle end of line (enter key)
        }

        scanner.close();
    }
}
