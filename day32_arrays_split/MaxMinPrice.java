package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99,    150.0,    9.99,     250.0,   439.50,  39.99};
        int[] itemIDs = {12345,      12346,    12347,     12348,   12349,  12350};

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        double maxPrice = prices[0];
        int indexOfMaxPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }

        }
        System.out.println("Most expensive item is: " + items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" + itemIDs[indexOfMaxPrice]);
        double minPrice = prices[0];
        int indexOfMinPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
                indexOfMinPrice = i;
            }

        }
        System.out.println("Least expensive item is: " + items[indexOfMinPrice] + " - $" + prices[indexOfMinPrice] + " - #" + itemIDs[indexOfMaxPrice]);

    }

    }
