package day18_Conditions_Review;

public class Authentication {
    public static void main(String[] args) {
    int last4SSN = 1234;
    int pinCode = 4321;

    int expLast4SSN = 4444;
    int expPinCode = 4444;

    if (last4SSN == expLast4SSN && pinCode == expPinCode){
        System.out.println("Authentication Successful");
    }else {
        System.out.println("Authentication unsuccessful");
        if (expLast4SSN != last4SSN){
            System.out.println("Last 4 SSN did not match");
        }
        if (pinCode != expPinCode){
            System.out.println("Pin code did not match");
        }
    }
    }
}
