package day38_methods;

import day37_overloading.WarmUpMethod;

import static day37_overloading.WarmUpMethod.*;

public class StringUtils {
    public static void main(String[] args) {
        String word = "civiC";
        System.out.println(word + " is palindrome = " + isPalindrome(word));
        System.out.println(word + " is palindrome = " + isPalindrome2(word));
        System.out.println(word + " is empty = " + isEmpty(word)); // static olarak çağırdıımız için doğrudan method name kullanabiliriz.

        String word2 = "java";
        System.out.println("reverse " + word2 + " = " + WarmUpMethod.reverse(word2));// dont have to use classname, I used just to show
    }
    public static boolean isPalindrome (String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2 (String str) {
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)){
            return true;
        }
        return false;
    }

}
