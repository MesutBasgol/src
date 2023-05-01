package day06_arithmetic_operators;

public class CalculateAge {
    public static void main(String[] args) {
        int yearOfBirth = 1983;
        int currentYear = 2023;
        int age = currentYear - yearOfBirth;
        System.out.println("I was born in " + yearOfBirth + ", as of " + currentYear + ", I am " + age + " years old.");
    }
}