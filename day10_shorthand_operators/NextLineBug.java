package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month:");
        double rent = scan.nextDouble();
        scan.nextLine(); // fix the bug. WORK - AROUND
        String month = scan.nextLine(); //because of enter it will produce only space - BUG/GLITCH
        System.out.println("rent: " + rent);
        System.out.println("month: " + month);
    }
}
