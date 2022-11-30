package Seminar1.HW1;

import java.util.Arrays;

public class Task1920 {
    public static void main(String[] args) {
        int[] numsList = new int[]{0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(numsList)));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
