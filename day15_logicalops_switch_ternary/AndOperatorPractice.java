package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";
        if (onSale && freeShipping) {
            System.out.println("Add to cart " + itemName);
        } else {
            System.out.println("Continue Shopping for good deals on " + itemName);
        }
        //add to cart only when it is freeShipping, onSale, and wooden spoon
        if (onSale && freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println("Add to cart " + itemName);
        } else {
            System.out.println("Continue Shopping for good deals on " + itemName);
        }
    }
}
