package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;
    public static void displayMessage (String message) {
        System.out.println("message: " + message);
    //    System.out.println("num= " + num); // ERROR. num is instance variable. Cannot be used in static method
        System.out.println("count= " + count);// NO ERROR. Count is static variable
    }
    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }
    //StaticMethods.instanceMethod(); > no
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethods();
    public void instanceMethod() {
        System.out.println("instance method");
        System.out.println("num=" + num);
        System.out.println("count= " + count);
        displayMessage("hello from instance method");
    }
}
