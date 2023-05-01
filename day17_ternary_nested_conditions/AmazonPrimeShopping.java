package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 15;
        boolean isPrimeMember = false;

        if (isPrimeMember){
            System.out.println("Eligible for free 2 day shipping");
        }else{
            if (itemPrice > 25){
                System.out.println("Eligible for free standard shipping");
            }else{
                System.out.println("Shipping price is $10");
            }
        }
    }
}
