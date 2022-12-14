package Seminar5.HW5;

import java.util.HashMap;
import java.util.Map;

public class Task219 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 1};
        int dist = 2;

        System.out.println(containsNearbyDuplicate(numbers, dist));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }
}
