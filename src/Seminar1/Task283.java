package Seminar1;

import java.util.Arrays;

public class Task283 {
    public static void main(String[] args) {
        int[] numsList = new int[] {0, 1, 0, 3, 12};
        moveZeroes(numsList);
    }

    public static void moveZeroes(int[] nums) {
        int copyInd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[copyInd] = nums[i];
                copyInd++;
            }
        }

        while (copyInd < nums.length) {
            nums[copyInd++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
