package Seminar2.HW2;

public class Task100 {
    public static void main(String[] args) {
        System.out.println("Решение задачи 100");
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) return true;

        if ((p == null || q == null) || (p.val != q.val)) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
