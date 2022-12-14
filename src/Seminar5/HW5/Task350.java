package Seminar5.HW5;

import java.util.*;

public class Task350 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{4, 9, 5};
        int[] numbers2 = new int[]{9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(numbers1, numbers2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        List<Integer> intersections = new ArrayList<>();

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) != 0) {
                intersections.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] res = new int[intersections.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = intersections.get(i);
        }

        return res;
    }
}
