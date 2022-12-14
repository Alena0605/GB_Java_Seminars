package Seminar5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int sum = 9;

        System.out.println(Arrays.toString(twoSums(numbers, sum)));
    }

    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];

            if (map.containsKey(val)) {
                return new int[]{map.get(val), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
