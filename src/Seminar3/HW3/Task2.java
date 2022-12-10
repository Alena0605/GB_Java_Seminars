package Seminar3.HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>(List.of(1, 12, 123, 1234, 12345));

        Iterator<Integer> numsIterator = numsList.iterator();
        while (numsIterator.hasNext()) {
            int num = numsIterator.next();
            if (num % 2 == 0) {
                numsIterator.remove();
            }
        }

        // СТРОКИ 11 - 16:
        // numsList.removeIf(num -> num % 2 == 0);

        System.out.println(numsList);
    }
}
