package Seminar2;

import java.util.ArrayList;
import java.util.List;

public class Task144 {
    public static void main(String[] args) {
        System.out.println("Решение задачи 144");
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);

        return ans;
    }

    private static void dfs(TreeNode root, List<Integer> ans) {
        if (root == null) return;

        ans.add(root.val);

        dfs(root.left, ans);
        dfs(root.right, ans);
    }
}
