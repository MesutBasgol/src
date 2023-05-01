package Office_Hours;

public class CastingPractices {
    public static void main(String[] args) {
        byte a = 5;
        int b = a;
        short s = (short) b;
        byte b2 = (byte) s;

        double d = 5.3;
        int i = (short) d;
        int i2 = (int) d;
        System.out.println(i); //5
        System.out.println((double)i); //5.0

        float f = 5; // int olarak gördüğü için f koymaya gerek yok
        float f2 = 5.25f;
        float f3 = (float) 5.25;

        long l = 32567; // consider the number as int and automatically cast
        long l2 = 23432345332L; // consider as int and gives error that's why we add L
        //long l3 = (long)23456874521; this is not possible

        double million = 1_000_000;
        System.out.println(million);

        System.out.println(l);
        System.out.println((double)l);
        System.out.println((float)l2);
        System.out.println(l2);
        System.out.println(l);



    }
}
