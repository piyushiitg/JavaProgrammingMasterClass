package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Float occupies 32 bits
        // double occupies 64 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My Min Float Value:" + myMinFloatValue);
        System.out.println("My Max Float Value: " + myMaxFloatValue);



        Double myMinDoubleValue = Double.MIN_VALUE;
        Double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My Min Double Value:" + myMinDoubleValue);
        System.out.println("My Max Double Value: " + myMaxDoubleValue);

        // Output
        // My Min Float Value:1.4E-45
        //My Max Float Value: 3.4028235E38
        //My Min Double Value:4.9E-324
        //My Max Double Value: 1.7976931348623157E308

        int myIntValue = 5/3;
        float myFloatValue = 5/3f; // 5.25 without f will give error because of casting default is double in decimal
        // float is recommended to use. 5.25f you can also use
        double myDoubleValue = 5/3d; // if you specify 5.00/3.00 instead of d that is also correct

        //Output: MyInt Value: 5
        //myFloatValue Value: 5.0
        //myDoubleValue Value: 5.0

        System.out.println("MyInt Value: " + myIntValue);
        System.out.println("myFloatValue Value: " + myFloatValue);
        System.out.println("myDoubleValue Value: " + myDoubleValue);

        // After division by 2
        // MyInt Value: 2
        //myFloatValue Value: 2.5
        //myDoubleValue Value: 2.5

        // After division by 3 ....Presicion was 16 digits in double
        // MyInt Value: 1
        //myFloatValue Value: 1.6666666
        //myDoubleValue Value: 1.6666666666666667



    }
}
