package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {
    // Queue = FIFO - First In First Out
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 1. offer(object) = add(object)
        queue.offer("First_queue");
        queue.offer("Second_queue");
        queue.offer("Third_queue");
        System.out.println(queue);

        // 2. peek() = getFirst
        System.out.println(queue.peek());

        // 3. poll() = remove first index
        queue.poll();
        System.out.println(queue);

        // 4. element() = getFirst
        System.out.println(queue.element());
        System.out.println(queue);

    }
}
