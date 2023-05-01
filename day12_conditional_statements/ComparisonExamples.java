package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);
        System.out.println("Are you speeding? -" + isSpeeding);

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");
        System.out.println("Are you speeding? -" + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        //System.out.println("Can I afford? - " + (accountBalance >= itemPrice));
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can I Afford? " + canAfford);
        //decrease balance by itemPrice using shorthand operator
        accountBalance -= itemPrice;

        Boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);
    }
}
