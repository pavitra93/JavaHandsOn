

import java.util.PriorityQueue;

public class Learn_Collections_04_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.offer(4);
        pqueue.offer(1);
        pqueue.offer(2);
        pqueue.offer(0);
        pqueue.offer(3);

        System.out.println(pqueue);
        pqueue.poll();
        System.out.println(pqueue);
        pqueue.poll();
        System.out.println(pqueue);

        System.out.println(pqueue.peek());
    }
}
