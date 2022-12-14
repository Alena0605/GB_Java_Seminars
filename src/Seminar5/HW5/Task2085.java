package Seminar5.HW5;

import java.util.HashMap;
import java.util.Map;

public class Task2085 {
    public static void main(String[] args) {
        String[] text1 = new String[]{"leetcode", "is", "amazing", "as", "is"};
        String[] text2 = new String[]{"amazing", "leetcode", "is"};

        System.out.println(countWords(text1, text2));
    }

    public static int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }

        Map<String, Integer> map = new HashMap<>();

        for (String word : words1) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }

        for (String word : words2) {
            if (map.containsKey(word)) {
                if (map.get(word) <= 1) {
                    map.put(word, map.get(word) - 1);
                }
            }
        }

        int count = 0;

        for (String key : map.keySet()) {
            if (map.get(key) == 0) {
                count++;
            }
        }

        return count;
    }
}
