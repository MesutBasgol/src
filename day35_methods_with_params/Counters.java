package day35_methods_with_params;

public class Counters {
    public static void main(String[] args) {
        count(10);
    }
    public static void count(int num){
        for (int i = 0; i <= num ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
