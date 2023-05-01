package day43_lis_custom_methods;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        long start = System.nanoTime();
        List<Integer> nums = getIntegerList();
        long end = System.nanoTime();
        System.out.println("ArrayList Time = " + (end-start));

        long st = System.nanoTime();
        int[] mlnNums = getIntegerArray();
        long en = System.nanoTime();
        System.out.println("Array Time = " + (en-st));
        //System.out.println("mlnNums = " + mlnNums);
    }
    public static List<Integer> getIntegerList (){
        List<Integer> nums = new ArrayList<>();
        for (int i=0; i<=1000_000; i++){
            nums.add(i);
        }
        return nums;
    }
    public static int[] getIntegerArray(){
        int[] nums = new int[1_000_001];
        for (int i = 0; i <= 1_000_000 ; i++) {
            nums[i] = i;
        }
    return nums;
    }
}
