package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {
    // Queue = FIFO - First In First Out
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 1. offer(object) = add(object) and return object
        queue.offer("First_queue");
        queue.offer("Second_queue");
        System.out.println("Third_queue");
        System.out.println(queue);

        // 2. peek() = getFirst
        System.out.println(queue.peek());

        // 3. poll() =  remove and return first index
        System.out.println(queue.poll());

        // 4. element() = getFirst
        System.out.println(queue.element());
        System.out.println(queue);

    }
}
