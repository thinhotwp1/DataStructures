import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;

public class QueueSample {
    // Queue = FIFO - First In First Out
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.offer("First_queue");
        stringQueue.offer("Second_queue");
        stringQueue.offer("Third_queue");
        System.out.println(stringQueue);

        // peek() = getFirst
        System.out.println(stringQueue.peek());

        // First In First Out, remove first index by poll
        stringQueue.poll();
        System.out.println(stringQueue);

        // element() = getFirst
        System.out.println(stringQueue.element());
        System.out.println(stringQueue);
    }
}
