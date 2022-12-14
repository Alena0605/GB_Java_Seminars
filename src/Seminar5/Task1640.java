package Seminar5;

import java.util.HashMap;
import java.util.Map;

public class Task1640 {
    public static void main(String[] args) {
        int[] numsArray = new int[]{91, 4, 64, 78};
        int[][] numsPieces = new int[][]{{78}, {4, 64}, {91}};

        System.out.println(canFormArray(numsArray, numsPieces));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();

        for (var piece : pieces) {
            map.put(piece[0], piece);
        }

        int i = 0;
        while (i < arr.length) {
            if (!map.containsKey(arr[i])) {
                return false;
            }

            int[] piece = map.get(arr[i]);

            for (var x : piece) {
                if (x != arr[i]) {
                    return false;
                }
                i++;
            }
        }

        return true;
    }
}
