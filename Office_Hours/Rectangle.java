package Office_Hours;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Hard coded values
        //double length = 5;
        //double width = 3;
        //dynamic with Scanner
        // if you want to rename any word in here, go to refactor/rename
        System.out.println("Enter the length: ");
        double length = scan.nextDouble();
        System.out.println("Enter the width: ");
        double width = scan.nextDouble();
        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
}
