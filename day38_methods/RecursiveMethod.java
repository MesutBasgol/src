package day38_methods;

public class RecursiveMethod {
    public static void count (int num){
        System.out.print(num +" ");
        num++;

        if (num <=100) {
            count(num);
        }
    }

    public static void main(String[] args) {
        count(1);
    }
}
