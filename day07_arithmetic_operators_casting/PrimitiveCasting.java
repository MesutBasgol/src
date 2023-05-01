package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int n1 = 4;
        //byte b1 = n1; // Shows error as int is larger than byte
        byte b1 = (byte) n1; // here's how it can work
        short shNum1 = (short) n1; // only possible this way
        long lNum1 = n1;
        System.out.println(n1);
        System.out.println(b1);
        System.out.println(shNum1);
        System.out.println(lNum1);
        byte b2 = 55;
        int n2 = b2; // possible since you can put smaller bag into larger one.


    }
}
