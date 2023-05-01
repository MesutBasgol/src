package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drink = "tea";
        String snack = "chips";
        if (selection.equals("drink")) {
            if (drink.equals("tea")){
                System.out.println("Tea is selected");
            }else{
                System.out.println("coke is selected");
            }
        } else if (selection.equals("snack")){
                if (snack.equals("chips")){
                    System.out.println("Chips is selected");
                }else{
                    System.out.println("Candy is selected");
                }
            }
        }
    }
