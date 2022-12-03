package Seminar3;

// Обойти конем доску так, чтобы конь посетил каждую клеточку 1 раз.

import java.util.Arrays;

public class HorseTrack {
    static int[][] board;
    static int[][] moves = {{1, 2}, {-1, 2}, {1, -2}, {-1, -2},
                            {2, 1}, {-2, 1}, {2, -1}, {-2, -1}};

    public static void main(String[] args) {
        int n = 6;
        board = new int[n][n];

        horseBackTrack(0, 0, 1);
    }

    private static boolean canPlace(int i, int j) {
        return i >= 0 && i < board.length && j >=0 && j < board.length && board[i][j] == 0;
    }

    public static void horseBackTrack(int i, int j, int step) {
        board[i][j] = step;

        if (step == board.length * board.length) {
            printBoard();
            return;
        }

        for (int[] move : moves) {
            int newI = i + move[0];
            int newJ = j + move[1];
            if (canPlace(newI, newJ)) {
                horseBackTrack(newI, newJ, step + 1);
            }
        }

        board[i][j] = 0;
    }

    private static void printBoard() {
        for (var r : board) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }
}
