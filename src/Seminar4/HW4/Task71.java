package Seminar4.HW4;

import java.util.Stack;

public class Task71 {
    public static void main(String[] args) {
        String directory = "/../";
        System.out.println(simplifyPath(directory));
    }

    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        String[] dirPaths = path.split("/");

        for (String dirPath : dirPaths) {
            if (dirPath.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (!dirPath.isEmpty() && !dirPath.equals(".")) {
                st.push(dirPath);
            }
        }

        if (st.isEmpty()) return "/";

        while (!st.isEmpty()) {
            ans.insert(0, st.pop()).insert(0, "/");
        }

        return ans.toString();
    }
}
