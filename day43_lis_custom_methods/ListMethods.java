package day43_lis_custom_methods;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        List<String> dayNames = getDays();
        dayNames.add("Java Day");
        System.out.println(dayNames);

        dayNames.removeIf(day -> day.length() == 6); // day is just a variable
        System.out.println("dayNames after removeIf = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums size = " + nums.size());
        System.out.println("nums = " + nums);

        nums.removeIf(num -> num <90);
        System.out.println("nums = " + nums);
    }
    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    return days;
    }
    public static List<Integer> getRandomList(int size){
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <=size ; i++) {
//            int n = random.nextInt(101);
//            if (!nums.contains(n)) {
//            nums.add(n);
//            }
        nums.add(random.nextInt(101));
        }
    return nums;
    }
}
