package Seminar2.HW2;

import java.util.Arrays;

public class Task733 {
    public static void main(String[] args) {
        int[][] numsList = new int[][]{{1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}};
        int i = 1, j = 1;
        int newColor = 2;

        System.out.println(Arrays.deepToString(floodFill(numsList, i, j, newColor)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        dfs(image, sr, sc, oldColor, color);
        return image;
    }

    private static void dfs(int[][] img, int row, int column, int oldCol, int newCol) {
        if (row < 0 || row >= img.length || column < 0 || column >= img[0].length || img[row][column] != oldCol) {
            return;
        }

        img[row][column] = newCol;

        dfs(img, row - 1, column, oldCol, newCol);
        dfs(img, row + 1, column, oldCol, newCol);
        dfs(img, row, column - 1, oldCol, newCol);
        dfs(img, row, column + 1, oldCol, newCol);
    }
}
