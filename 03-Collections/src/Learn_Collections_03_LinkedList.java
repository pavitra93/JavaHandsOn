

import java.util.LinkedList;
import java.util.Queue;

public class Learn_Collections_03_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        // Add items to linkedlist
        linkedlist.add(12);
        linkedlist.add(24);
        linkedlist.add(36);
        System.out.println(linkedlist);

        // Remove item from list
        linkedlist.remove(2);
        System.out.println(linkedlist);

        // Adds to first index
        linkedlist.addFirst(6);
        System.out.println(linkedlist);

        // Add last of linkedlist
        linkedlist.addLast(48);
        System.out.println(linkedlist);
        linkedlist.removeLast();
        System.out.println(linkedlist);

        // Fetch head of linked list
        System.out.println(linkedlist.peek());
        System.out.println(linkedlist.peekFirst());

        // Fetch last of linked list
        System.out.println(linkedlist.peekLast());

        // Linked List as Queue

        Queue<Integer> queue = new LinkedList<>();
        // Adds item to linkedlist queue
        queue.offer(1);
        System.out.println(queue);

        // Removes first element like queue in linkedlist
        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

    }
}
