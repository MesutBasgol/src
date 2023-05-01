package day18_Conditions_Review;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;
        int num3 = 11;

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Largest value: " + num1);
        }else if (num2 >= num1 && num2 >= num3){
            System.out.println("Largest value: " + num2);
        }else {
            System.out.println("Largest value: " + num3);
        }
        //else if (num3 >= num1 && num3 >= num2){
        //    System.out.println("Largest value: " + num3);
        //}
    }
}
