package Seminar2.HW2;

public class Task100 {
    public static void main(String[] args) {
        // Создаем дерево 1
        // ----------------------------------------
        TreeNode tree1 = new TreeNode(5);
        TreeNode tree1left = new TreeNode(1);
        TreeNode tree1right = new TreeNode(2);

        tree1.left = tree1left;
        tree1.right = tree1right;
        // ----------------------------------------

        // Создаем дерево 2
        // ----------------------------------------
        TreeNode tree2 = new TreeNode(5);
        TreeNode tree2left = new TreeNode(1);
        TreeNode tree2right = new TreeNode(2);

        tree2.left = tree2left;
        tree2.right = tree2right;
        // ----------------------------------------

        System.out.println(isSameTree(tree1, tree2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
