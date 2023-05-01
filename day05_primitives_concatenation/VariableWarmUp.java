package day05_primitives_concatenation;

public class VariableWarmUp {
    public static void main(String [] args){
        int count = 10;
        System.out.println(count);
        count = 25;
        System.out.println(count);
        double birthDate = 3.04;
        int year = 1983;
        String fullBirthDate = "0" + birthDate + "." + year;
        System.out.println(fullBirthDate);
    }
}
