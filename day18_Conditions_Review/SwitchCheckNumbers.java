package day18_Conditions_Review;

public class SwitchCheckNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        switch (num1){
            case 10:
                num1++;
                num2 += 10;
                break;
            case 20:
                num1 += num2;
                num2--; // because we dont have break it will also run following case
            case 30:
                num1 = 0;
                num2 -= 3;
                break;
        }
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
