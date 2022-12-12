package Seminar4.HW4;

import java.util.Stack;

public class Task232 {
    static Stack<Integer> in;
    static Stack<Integer> out;
    static int front;

    public static void main(String[] args) {
        // ["MyQueue (Task232)", "push", "push", "push", "peek", "pop", "peek", "empty"]
        // [[], [4], [6], [9], [], [], [], []]

        // MyQueue myQueue = new MyQueue();
        // myQueue.push(4);  // queue is: [4]
        // myQueue.push(6);  // queue is: [4, 6]
        // myQueue.push(9);  // queue is: [4, 6, 9] (leftmost is front of the queue)
        // myQueue.peek();   // return 4
        // myQueue.pop();    // return 4, queue is: [6, 9]
        // myQueue.peek();   // return 6
        // myQueue.empty();  // return false

        System.out.println("Решение задачи 232");
    }

    public Task232() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public static void push(int x) {
        if (in.isEmpty()) {
            front = x;
        }

        while (!in.isEmpty()) {
            out.push(in.pop());
        }

        out.push(x);

        while (!out.isEmpty()) {
            in.push(out.pop());
        }
    }

    public static int pop() {
        int res = in.pop();

        if (!in.empty()) {
            front = in.peek();
        }

        return res;
    }

    public static int peek() {
        return front;
    }

    public static boolean empty() {
        return in.isEmpty();
    }
}
