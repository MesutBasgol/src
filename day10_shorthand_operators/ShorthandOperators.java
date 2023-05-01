package day10_shorthand_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);
        cars -= 6;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        System.out.println("electric cars in parking lot = " + electricCars);
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word = word + " programming";
        System.out.println("word = " + word);
        // add " is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        // add 'J' to letter
        letter += 'a';
        System.out.println("letter = " + letter);
    }
}
