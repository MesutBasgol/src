package day05_primitives_concatenation;

public class UsingVariables {
    public static void main (String[] args) {
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);
        num1 = 200;
        System.out.println(num1);
        System.out.println(num2);

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        n2 =95;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
