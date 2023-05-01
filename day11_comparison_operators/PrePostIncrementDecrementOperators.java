package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int cars = 15;
        int electricCars = ++cars; //first adds 1 to cars then assigns
        System.out.println("cars = " + cars);
        System.out.println("electricCars = " + electricCars);

        int cars2 = 20;
        int electricCars2 = cars2++; // first assigns then adds 1 to cars
        System.out.println("cars = " + cars2);
        System.out.println("electricCars = " + electricCars2);

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars3 = 5;
        System.out.println("cars3 = " + ++cars3);//first adds 1 to variable than prints
        int sedans = 15;
        System.out.println("sedans = " + sedans++);// first prints than adds 1 to variable
        System.out.println("sedans = " + sedans);//changed because of previous post-increment

        int a = 50;
        int b = 22;
        int c = (a++ + ++b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
