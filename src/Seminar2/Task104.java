package Seminar2;

public class Task104 {
    public static void main(String[] args) {
        System.out.println("Решение задачи 104");
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }
}
