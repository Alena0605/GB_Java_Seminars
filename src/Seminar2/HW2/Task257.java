package Seminar2.HW2;

import java.util.ArrayList;
import java.util.List;

public class Task257 {
    static List<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        // Создаем дерево
        // -------------------------------------
        TreeNode tree = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);

        tree.left = left;
        tree.right = right;

        left.left = new TreeNode(5);
        // -------------------------------------

        System.out.println(binaryTreePaths(tree));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return ans;
    }

    private static void dfs(TreeNode root, String path) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            ans.add(path + root.val);
            return;
        }

        dfs(root.left, path + root.val + "->");
        dfs(root.right, path + root.val + "->");
    }
}
