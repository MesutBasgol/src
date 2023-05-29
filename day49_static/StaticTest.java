package day49_static;

public class StaticTest {
    static String word = "java"; // if you don't make this static you can't use inside static content
    public static void main(String[] args) {
        StaticMethods.displayMessage("Wooden Spoon");
        StaticMethods staticMethods = new StaticMethods();
        staticMethods.instanceMethod();

        System.out.println(word);

    }
}
