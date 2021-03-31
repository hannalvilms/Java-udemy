package com.company;

public class Main {

    public static void main(String[] args) {
	    /*long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);*/

        /*boolean wakeUp = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(wakeUp);*/

        boolean number = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(number);
        boolean teen = TeenNumberChecker.isTeen(15);
        System.out.println(teen);
    }
}
