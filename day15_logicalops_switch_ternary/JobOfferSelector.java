package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "New York";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean hasBenefits = true;

        if (location.equals("New York") && salary >= 120_000.0 && isRemote && hasBenefits){
            System.out.println("Sure, I will accept this offer");
        }else {
            System.out.println("Lets consider another offer or negotiate");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }
    }
}
