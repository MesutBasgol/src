package day24_do_while_loop;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;
        do {
            System.out.println("Enter pinCode:");
            pinCode = scan.nextInt();
        }while (pinCode != secretPinCode);
        System.out.println("pinCode is correct");
    }
}
