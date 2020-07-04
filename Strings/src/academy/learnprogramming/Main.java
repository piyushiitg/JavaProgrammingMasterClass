package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // 8 primitive type
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String is not the primitive type and its a class
        // sequence of char

        String myString = " This is the String";
        System.out.println("My String: "  + myString);

        myString = myString + " and this is more";
        System.out.println("My String: "  + myString);

        // add unicode char
        myString = myString + "\u00A9 2019";
        System.out.println("My String: "  + myString); // This is the String and this is more© 2019

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println(numberString); // 250.5549.55

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String " + lastString); // 1050

        //myInt = myInt + lastString; its a error
        // System.out.println(myInt);

        // String in Java are immutable
        // StringBuffer can be used it is mutable






    }

}
