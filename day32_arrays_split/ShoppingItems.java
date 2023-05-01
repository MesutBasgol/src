package day32_arrays_split;

import java.util.Arrays;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99,    150.0,    9.99,     250.0,   439.50,  39.99};
        int[] itemIDs = {12345,      12346,    12347,     12348,   12349,  12350};

        System.out.println("----- FIND THE INDEX OF 'Gloves' IN ITEMS ARRAY");
        int indexOfGloves = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index: " + i);
                break;
            }
        }
        System.out.println("---- Set boolean to true if first iPad is Found ----");
        boolean iPadExists = false;
        for (String item : items){
            if (item.equalsIgnoreCase("ipad")){
                iPadExists = true;
                System.out.println("iPadExists = " + iPadExists);
                break;
            }

        }
//        for (int i = 0; i < items.length; i++) {
//            if (items[i].equals("iPad")){
//                iPadExists = true;
//                System.out.println("iPadExists = " + iPadExists);
//                break;
//            }
//        }
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + " - " + itemIDs[i]);
        }

        System.out.println("--- Look for 'Jacket' in items and print details---");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jacket")){
                System.out.println(items[i] + " - " + prices[i] + " - " + itemIDs[i]);
                break;
            }

        }
    }
}
