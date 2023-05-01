package day12_conditional_statements;
import java.util.Scanner;
public class IfElseStatement2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        byte age = scan.nextByte();
         if (age >= 18) {
             System.out.println("You are eligible to vote");
             System.out.println("Your age is greater or equal to 18");
         }else {
             System.out.println("You are not eligible to vote");
             System.out.println("Your age is less than 18");
         }
    }
}
