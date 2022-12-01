package Seminar2;

public class RecursiveExample {
    public static void main(String[] args) {
        findPath(1, 4, 1, 2, "");
    }

    public static void findPath(int src, int target, int summand, int multiplier, String path) {
        if (src > target) return;

        if (src == target) {
            System.out.println(path);
            return;
        }

        findPath(src + summand, target, summand, multiplier, path + "К1 ");
        findPath(src * multiplier, target, summand, multiplier, path + "К2 ");
    }
}
