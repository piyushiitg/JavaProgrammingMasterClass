package academy.learnprogramming;

public class Main {
    // primitive type in Java
    public static void main(String[] args) {
	   int myValue = 10000;

	   // Int takes 32 bits
	   int myMinIntValue = Integer.MIN_VALUE;
	   int myMaxIntValue = Integer.MAX_VALUE;
	   // Integer is a wrapper class of int
        // there are 8 wrapper class for all the primitive
        // data types
        System.out.println("Integer Minimum value: " +  myMinIntValue);
        System.out.println("Integer Maximum value: " +  myMaxIntValue);
        //OutPut Integer Minimum value: -2147483648
        //       Integer Maximum value: 2147483647
        System.out.println("Buster Max value: " + (myMaxIntValue + 1));
        //Integer Maximum value: 2147483647
        //Buster Max value: -2147483648 // this is the overflow
        System.out.println("Busted Min Value: " + (myMinIntValue-1));
        //Busted Min Value: 2147483647 // This is underflow

        // int myMaxIntTest = 2147483648; // Integer Number too large

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min value: " + myMinByteValue);
        System.out.println("Byte Max Value: " + myMaxByteValue);
        //Byte Min value: -128
        // Byte Max Value: 127 // Use small datatype
        // today we donot worry about memory
        // Byte takes 8 bits


        // Short takes 16 bits
        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min value: " + myMinShortValue);
        System.out.println("Short Max Value: " + myMaxShortValue);

        //Short Min value: -32768
        //Short Max Value: 32767
        
        // Size of bits 64 2^63
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min value: " + myMinLongValue);
        System.out.println("Long Max Value: " + myMaxLongValue);

        //Long Min value: -9223372036854775808
        //Long Max Value: 9223372036854775807

        long bigLongLiteralValue = 2_147_483_647_243L; // 2147483647243L
        System.out.println(bigLongLiteralValue);
        // Output: 2147483647243

        short bigShortLiteralValue = 32767; // 32768 gives the error think like its int

        // Casting in Java and Arithmatic

        // Java expecting default as a integer
        // thats why we need to cast to particular type
        int myTotal = (myMinIntValue/2);
        // byte myNewByteValue = (myMinByteValue/2); it will be int
        byte myNewByteValue = (byte) (myMinByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);

        // Primitive type challenges




    }
}
