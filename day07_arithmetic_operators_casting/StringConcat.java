package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("java"+5+3); // Output is java53
        System.out.println("java"+(5+3)); // Output is java8
        System.out.println(5 + 3 + "java"); // Output is 8java
        System.out.println(5 + (3 + "java")); // Output is 53java

        System.out.println("hello" + 1 + 2 + 3); //output is hello123
        System.out.println("hello" + (1 + 2 + 3)); //output is hello6
        System.out.println("hello" + 1 + (2 + 3)); //output is hello15

        String str1 = "hello";
        String str2 = "friends";
        char space = ' ';
        System.out.println(str1 + " " + str2);
        System.out.println(str1 + space + str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1+num2);
        System.out.println(num1 + " " + num2);
        System.out.println(num1 + "" + num2);

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1+char2); // output is 195 (97+98) because of ASCII
        System.out.println(char1 + "" + char2); //output is ab
    }
}
