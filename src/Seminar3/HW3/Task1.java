package Seminar3.HW3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    static char[] eqToChars;
    static List<Integer> questionsIndexes;
    static List<List<Integer>> ans;

    public static void main(String[] args) {
        String equation = "5? + 25 = ??".replaceAll(" ", "").replace('+', '=');

        eqToChars = equation.toCharArray();
        questionsIndexes = new ArrayList<>();

        for (int i = 0; i < eqToChars.length; i++) {
            if (eqToChars[i] == '?') {
                questionsIndexes.add(i);
            }
        }

        int questionsCount = questionsIndexes.size();

        if (combine(questionsCount).size() == 0) {
            System.out.println("Решений нет");
        }
    }

    public static List<List<Integer>> combine(int k) {
        ans = new ArrayList<>();
        helper(k, new ArrayList<>());
        return ans;
    }

    private static void helper(int count, List<Integer> comb) {
        if (comb.size() == count) {
            check(comb);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            comb.add(i);
            helper(count, comb);
            comb.remove(comb.size() - 1);
        }
    }

    private static void check(List<Integer> comb) {
        for (int i = 0; i < questionsIndexes.size(); i++) {
            eqToChars[questionsIndexes.get(i)] = Character.forDigit(comb.get(i), 10);
        }

        String[] eqParts = String.valueOf(eqToChars).split("=");
        int a = Integer.parseInt(eqParts[0]);
        int b = Integer.parseInt(eqParts[1]);
        int c = Integer.parseInt(eqParts[2]);

        if (a + b == c) {
            ans.add(new ArrayList<>(comb));
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();
        }
    }
}
