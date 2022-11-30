package Seminar1.HW1;

public class Task151 {
    public static void main(String[] args) {
        String words = " the sky  is blue ";
        System.out.println(reverseWords(words));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;

        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end--;
            } else {
                int start = end - 1;

                while (start >= 0 && s.charAt(start) != ' ') {
                    start--;
                }

                sb.append(s, start + 1, end + 1);
                sb.append(' ');
                end = start - 1;
            }
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }
}
