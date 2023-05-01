package day25_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number");
        int num = scan.nextInt();
        for (int i=1; i<=num; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum 1 to "+num + "= " + sum);
    }
}
