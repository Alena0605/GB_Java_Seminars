package Seminar5.HW5;

import java.util.HashMap;
import java.util.Map;

public class Task13 {
    public static void main(String[] args) {
        String roman = "MCMXCIV";

        System.out.println(romanToInt(roman));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();

        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (romans.get(s.charAt(i)) < romans.get(s.charAt(i + 1))) {
                res -= romans.get(s.charAt(i));
            } else {
                res += romans.get(s.charAt(i));
            }
        }

        return res + romans.get(s.charAt(s.length() - 1));
    }
}
