package Seminar1.HW1;

import java.util.Arrays;

public class Task88 {
    public static void main(String[] args) {
        int[] numsList1 = new int[]{3, 4, 5, 7, 0, 0, 0};
        int m = 4;
        int[] numsList2 = new int[]{1, 2, 6};
        int n = 3;
        merge(numsList1, m, numsList2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1, i2 = n - 1;
        int i = m + n - 1;

        while (i1 >= 0 && i2 >= 0) {
            if (nums1[i1] < nums2[i2]) {
                nums1[i--] = nums2[i2--];
            } else {
                nums1[i--] = nums1[i1--];
            }
        }

        while (i1 >= 0 && i >= 0) {
            nums1[i--] = nums1[i1--];
        }

        while (i2 >= 0 && i >= 0) {
            nums1[i--] = nums2[i2--];
        }

        System.out.println(Arrays.toString(nums1));
    }
}
