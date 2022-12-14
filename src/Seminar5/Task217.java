package Seminar5;

import java.util.HashSet;
import java.util.Set;

public class Task217 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 1};

        System.out.println(containsDuplicate(numbers));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
