package day13_IfElseStatements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")){ // if (city == "Los Angeles") also possible but not preferred so much
            System.out.println("It is LA");
        }else {
            System.out.println("It is not LA");
        }
        String weather = "sunny";
        if (weather.equals("sunny")){
            System.out.println("Lets go out and code Java");
        }else{
            System.out.println("Lets stay indoors, and code Java");
        }
    }
}
