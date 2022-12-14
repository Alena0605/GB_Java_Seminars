package Seminar3;

import java.util.ArrayList;
import java.util.List;

public class Task51 {
    int[][] board;
    List<List<String>> ans;

    public static void main(String[] args) {
        Task51 task = new Task51();
        System.out.println(task.solveNQueens(4));
    }

    public List<List<String>> solveNQueens(int n) {
        board = new int[n][n];
        ans = new ArrayList<>();
        backTrack(0);

        return ans;
    }

    private void backTrack(int col) {
        if (col == board.length) {
            addBoard();
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (canPlace(row, col)) {
                board[row][col] = 1;
                backTrack(col + 1);
                board[row][col] = 0;
            }
        }
    }

    private void addBoard() {
        List<String> b = new ArrayList<>();
        for (int[] ints : board) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(ints[j] == 0 ? '.' : 'Q');  // ints[j] == board[i][j]
            }
            b.add(sb.toString());
        }
        ans.add(b);
    }

    private boolean canPlace(int i, int j) {
        // налево
        for (int col = j - 1; col >= 0 ; col--) {
            if (board[i][col] == 1) return false;
        }

        // вверх по диагонали
        for (int row = i - 1, col = j - 1; row >= 0 && col >= 0; row--, col--) {
            if (board[row][col] == 1) return false;
        }

        // вниз по диагонали
        for (int row = i + 1, col = j - 1; row < board.length && col >= 0; row++, col--) {
            if (board[row][col] == 1) return false;
        }

        return true;
    }
}
