package com.company;

public class Main {

    public static void main(String[] args) {

      //Primitive types
      //boolean, byte, char, short, int, long, float, double

        //Int - 32bits
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Int min value: " + minIntValue);
        System.out.println("Int max value: " + maxIntValue);

        //Byte - 8bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value: " + myMinByteValue);
        System.out.println("Byte max value: " + myMaxByteValue);

        //Short - 16bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value: " + myMinShortValue);
        System.out.println("Short max value: " + myMaxShortValue);

        //Long - 64bits
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value: " + myMinLongValue);
        System.out.println("Long max value: " + myMaxLongValue);

        //if number too long, add L
        long longValue = 22222222222L;
        System.out.println(longValue);

        int myTotal = (minIntValue / 2);
        //casting - treat as a byte/short not int
        byte newByteValue = (byte) (myMinByteValue / 2);
        short newShortValue = (short) (myMaxShortValue / 2);

        //challenge
        byte validByte = 111;
        short validShort = 2222;
        int validInt = 333333333;
        long sum = (50000L + (10L * (validByte + validInt + validShort)));
        System.out.println(sum);
    }
}