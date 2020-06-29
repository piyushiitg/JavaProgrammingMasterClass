package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue + shortValue+ intValue);
        System.out.println((longTotal));
        // 50800

        short shortTotal = (short) (10000 + 10 *
                (byteValue + shortValue+ intValue));

        // int is best primitive datatype
        // you donot have to use other primitive datatype

    }
}
