package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(25);
        nums.add(15);
        nums.add(5);
        nums.add(2);
        nums.add(25);
        nums.add(5);
        nums.add(20);
        nums.add(125);
        nums.add(325);
        nums.add(0);
        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println("nums = " + nums);

        nums.remove(new Integer(125));
        System.out.println("nums = " + nums);

        nums.remove(new Integer(5)); // removes the first 5, use loop for removing all
        System.out.println("nums = " + nums);

        for (int i =0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        for (int each : nums) {
            System.out.print(each + " ");
        }
    }
}
