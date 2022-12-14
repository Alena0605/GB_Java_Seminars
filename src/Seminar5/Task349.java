package Seminar5;

import java.util.*;

public class Task349 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 2, 1};
        int[] numbers2 = new int[]{2, 2};

        System.out.println(Arrays.toString(intersection(numbers1, numbers2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        List<Integer> intersect = new ArrayList<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
                set.remove(num);
            }
        }

        int[] res = new int[intersect.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = intersect.get(i);
        }

        return res;
    }
}
