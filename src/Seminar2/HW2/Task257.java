package Seminar2.HW2;

import java.util.ArrayList;
import java.util.List;

public class Task257 {
    public static void main(String[] args) {
        System.out.println("Решение задачи 257");
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();

        if (root != null) {
            StringBuilder sb = new StringBuilder();
            dfs(root, ans, sb);
        }

        return ans;
    }

    public void dfs(TreeNode root, List<String> ans, StringBuilder sb) {
        if (root.left == null && root.right == null) {
            sb.append(root.val);
            ans.add(sb.toString());
            return;
        }

        if (root.left != null) {
            String nowList = sb.toString();
            sb.append(root.val).append("->");
            dfs(root.left, ans, sb);
            sb = new StringBuilder(nowList);
        }

        if (root.right != null) {
            sb.append(root.val).append("->");
            dfs(root.right, ans, sb);
        }
    }
}
