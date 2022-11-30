package Seminar1.HW1;

public class Task125 {
    public static void main(String[] args) {
        String text = "race a car  ";
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char leftLetter = Character.toLowerCase(s.charAt(left));
            char rightLetter = Character.toLowerCase(s.charAt(right));

            if (leftLetter != rightLetter) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
