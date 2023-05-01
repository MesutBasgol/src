package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 75;
        String result1 = (score > 60) ? "Pass" : "Fail";
        System.out.println("result1 = " + result1);

        char result2 = (score > 90) ? 'A' : 'B';
        System.out.println("result2 = " + result2);

        String quality = "Good";
        int rating = (quality.equals("Good")) ? 100 : 0 ;
        System.out.println("rating = " + rating);
        System.out.println(quality.equals("Good") ? 100 : 0);


    }
}
