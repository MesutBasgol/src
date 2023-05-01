package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int number = 150;
        number = number +50;
        System.out.println("number = " + number);
        double rent = 1350.0;
        rent = rent + 25.0;
        System.out.println("rent = " + rent);
        rent = rent - 45.0;
        System.out.println("rent = " + rent);
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int players = 10;
        System.out.println("players = " + players);
        players = players * 2;
        System.out.println("players = " + players);

        int cents = 568;
        System.out.println("cents = " + cents);
        // keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("remaining cents = " + cents);
    }
}
