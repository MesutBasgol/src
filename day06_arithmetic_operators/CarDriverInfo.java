package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String[] args){
        String carModel = "Chevrolet";
        String driverName = "Mesut BASGOL";
        int licenceNum = 1231230;
        short speed = 64;
        boolean isAutomatic = true;
        char licenceClass = 'C';
        char b = 'D';

        System.out.println("Car Model: " + carModel);
        System.out.println("Driver's Name: " + driverName);
        System.out.println("Licence Number: " + licenceNum);
        System.out.println("Speed: " + speed + " mph");
        System.out.println("Is Automatic: " + isAutomatic);
        System.out.println("Licence Class: " + licenceClass);
        System.out.println(driverName + " is driving " + carModel);
        System.out.println(licenceClass+" "+isAutomatic);
        System.out.println(carModel+speed);
        System.out.println(b+licenceClass); // İkisi de char olduğu için Ascii tablosunda karşılık gelen sayıları topluyor
        System.out.println(carModel + " " + licenceClass);
        double deneme;
        deneme = (licenceNum / speed);
        System.out.println(deneme);

    }
}
