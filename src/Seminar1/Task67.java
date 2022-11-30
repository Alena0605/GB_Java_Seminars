package Seminar1;

public class Task67 {
    // имя файла должно совпадать с именем класса (public)
    // классы называются в стиле CamelCase
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        int carry = 0;
        int i = a.length() - 1;
        StringBuilder sb = new StringBuilder();

        for (int j = b.length() - 1; j >= 0; j--) {
            if (b.charAt(j) == '1') {
                carry++;
            }
            if (i >= 0 && a.charAt(i) == '1') {
                carry++;
            }
            sb.append(carry % 2);
            i--;
            carry /= 2;
        }

        if (carry == 1) sb.append(carry);
        return sb.reverse().toString();
    }
}
