package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        //letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " +letters.size());
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println("reverse = " + letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));
        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("After replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 7, -95, 0, 5, 5, 5, 5);
        System.out.println("nums = " + nums);

        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        Collections.sort(nums);
        System.out.println("nums after sort = " + nums);

        int max = Collections.max(nums);
        System.out.println("max = " + max);

        int min = Collections.min(nums);
        System.out.println("min = " + min);

        System.out.println("frequency of 5 = " + Collections.frequency(nums,5));
        System.out.println("frequency of 1 = " + Collections.frequency(nums,1));

        Collections.replaceAll(nums,5,50);
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle = " + nums);
    }
}
