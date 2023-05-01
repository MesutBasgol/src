package day24_do_while_loop;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNum = new Random();
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber;
        //int guessRight = 0;
         do {
                System.out.println("Guess the secret number");
                guessingNumber = scan.nextInt();
                //guessRight += 1;
                if (guessingNumber > secretNumber) {
                    System.out.println("Daha kucuk numara giriniz:");
                    //System.out.println("Kalan tahmin hakki:" + (5 - guessRight));
                }
                if (guessingNumber < secretNumber) {
                    System.out.println("Daha buyuk numara giriniz:");
                    //System.out.println("Kalan tahmin hakki:" + (5 - guessRight));
                }
            } while (guessingNumber != secretNumber);
            System.out.println("Tebrikler, dogru tahmin:" + secretNumber);
      }
}
