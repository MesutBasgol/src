package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;
        float num5 = 124.4F;
        double num6 = num5;
        
        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);
        System.out.println("num9 = " + num9);
        
        int num10 = 55;
        byte num11 = (byte) num10;
        short num12 = (short) num10;
        System.out.println("num11 = " + num11);

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num14 = " + num14);
        System.out.println("num13 = " + num13);

        double num15 = 1234.5;
        int num16 = (int)num15;
        System.out.println("num16 = " + num16);
        System.out.println("num15 = " + num15);

        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18); //binary sistemden dolayı farklı bir rakam veriyor

        char letter = 'M';
        int numLetter = letter;
        System.out.println("numLetter = " + numLetter);
    }
}
