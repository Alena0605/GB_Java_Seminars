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
        int nowColor = image[sr][sc];
        if (nowColor != color) dfs(image, sr, sc, nowColor, color);
        return image;
    }

    public static void dfs(int[][] image, int sr, int sc, int nowColor, int color) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != nowColor) {
            return;
        }

        image[sr][sc] = color;

        dfs(image, sr - 1, sc, nowColor, color);
        dfs(image, sr + 1, sc, nowColor, color);
        dfs(image, sr, sc - 1, nowColor, color);
        dfs(image, sr, sc + 1, nowColor, color);
    }
}
