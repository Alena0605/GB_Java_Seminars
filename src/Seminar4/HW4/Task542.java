package Seminar4.HW4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Task542 {
    static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        int[][] field = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        System.out.println(Arrays.deepToString(updateMatrix(field)));
    }

    public static int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visitedCells = new boolean[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    q.add(new int[]{i, j});
                    visitedCells[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] curPoint = q.poll();
            int curI = curPoint[0];
            int curJ = curPoint[1];

            for (int[] direction : DIRECTIONS) {
                int newI = curI + direction[0];
                int newJ = curJ + direction[1];

                if (newI < 0 || newJ < 0 || newI >= mat.length || newJ >= mat[0].length || visitedCells[newI][newJ]) {
                    continue;
                }

                visitedCells[newI][newJ] = true;
                mat[newI][newJ] = mat[curI][curJ] + 1;
                q.add(new int[]{newI, newJ});
            }
        }

        return mat;
    }
}
