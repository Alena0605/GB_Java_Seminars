package Seminar4;

import java.util.LinkedList;
import java.util.Queue;

public class Task346 {
    static Queue<Integer> q = new LinkedList<>();
    static int windowSize;
    static double sum;

    public static void main(String[] args) {
        // ["MovingAverage (Task346)", "next", "next", "next", "next"]
        // [[3], [1], [10], [3], [5]]

        // MovingAverage ma = new MovingAverage(3);
        // ma.next(1);   // return 1.0 = 1 / 1
        // ma.next(10);  // return 5.5 = (1 + 10) / 2
        // ma.next(3);   // return 4.66667 = (1 + 10 + 3) / 3
        // ma.next(5);   // return 6.0 = (10 + 3 + 5) / 3

        System.out.println("Решение задачи 346");
    }

    public Task346(int size) {
        windowSize = size;
        sum = 0;
    }

    public static double next(int val) {
        sum += val;
        q.add(val);

        if (q.size() > windowSize) {
            sum -= q.poll();
        }

        return sum / q.size();
    }
}
