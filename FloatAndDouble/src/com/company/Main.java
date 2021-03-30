package com.company;

public class Main {

    public static void main(String[] args) {

        //float - 32bits

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value: " + minFloatValue);
        System.out.println("Float max value: " + maxFloatValue);

        //double - 64bits
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value: " + minDoubleValue);
        System.out.println("Double max value: " + maxDoubleValue);

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;
        System.out.println("int value:" + intValue);
        System.out.println("float value:" + floatValue);
        System.out.println("double value:" + doubleValue);

        //challenge
        double numberOfPounds = 200d;
        double convertedKg = numberOfPounds * 0.45359237d;
        System.out.println(convertedKg);
    }
}
