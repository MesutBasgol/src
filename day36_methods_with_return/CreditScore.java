package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(800);
    }
    public static void checkEligible (int creditScore){
        if (creditScore >= 700){
            System.out.println("You are eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing");
        }

    }
}
