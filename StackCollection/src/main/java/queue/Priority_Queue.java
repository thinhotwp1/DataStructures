package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {

        // 1. Priority Queue = Queue + sắp xếp thứ tự tăng hoặc giảm dần
        Queue<Double> queue = new PriorityQueue<>();

        // 1. Collections.reverseOrder() = sắp xếp thứ tự giảm dần
//        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        // offer(Object) = add(Object) + tự sắp xếp thứ tự tăng dần
        queue.offer(3.1);
        queue.offer(3.0);
        queue.offer(3.2);
        System.out.println(queue);

        // poll() = return min object and remove
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }

}
