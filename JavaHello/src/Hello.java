//class
public class Hello {

    //Main method
    //public-access modifier
    //static-Java keyword that needs an understanding of other concepts
    //void-indicates that he method will not return anything

    public static void main(String[] args) {

        System.out.println("Hello World!");

      //Variables
        String name = "Hanna";
        System.out.println("Hello, " + name + "!");

        //+-/*
        int firstNumber = (10 + 5) + (2 * 10);
        int secondNumber = 12;
        int thirdNumber = firstNumber * 2;
        //total
        int number = firstNumber + secondNumber + thirdNumber;
        //shortcut-sout
        System.out.println(number);

        int myLastOne = 1000 - number;
        System.out.println(myLastOne);

    }
}
