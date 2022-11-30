package Seminar1.HW1;

public class Task27 {
    public static void main(String[] args) {
        int[] numsList = new int[]{2, 4, 4, 1, 8, 4, 5};
        int num = 4;
        System.out.println(removeElement(numsList, num));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
