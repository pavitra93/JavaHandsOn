

import java.util.ArrayDeque;

public class Learn_Collections_05_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dequeue = new ArrayDeque<>();

        // adds last and first to the queue
        dequeue.offer(1);
        dequeue.offerFirst(2);
        dequeue.offerLast(3);

        System.out.println(dequeue);

        // peeks last and first to the queue
        System.out.println(dequeue.peek());
        System.out.println(dequeue.peekLast());
        System.out.println(dequeue.peekFirst());

        // polls last and first to the queue
        dequeue.poll();
        System.out.println(dequeue);

        dequeue.pollLast();
        System.out.println(dequeue);

        dequeue.pollFirst();
        System.out.println(dequeue);

    }
}
