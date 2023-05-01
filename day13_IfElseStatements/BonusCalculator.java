package day13_IfElseStatements;
// Ctrl + Alt + l automatically format the code
public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0; // int bonus; also valid
        double salesAmount = 900.55;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you are qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100;
        }
        System.out.println("Your bonus for Sales Amount is: $" + bonus);
    }
}
