package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate >45) ? "accept" : "reject";
        System.out.println("reply = " + reply);
        boolean reply2 = (hourlyRate >45) ? true : false;
        System.out.println("reply2 = " + reply2);

        String todaysClass = "Java";
        String teacher = (todaysClass.equals("Java")) ? "Murodil" : "Nadir";
        System.out.println("Today's Class is " + todaysClass + " and the teacher is " + teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "have DL, can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
