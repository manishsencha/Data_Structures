package QueueUsingLinkedList;

import java.util.LinkedList;

public class QueueList {
    
    // LinkedList for the queue
    private LinkedList<Integer> llist = new LinkedList<Integer>();

    // Method isEmpty() returns true if the queue is empty else returns false
    boolean isEmpty() {
        return llist.isEmpty();
    }

    // Method enque() insert element to the queue if the queue is not full
    void enque(int data) {
        try {
            llist.add(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method deque() deletes an element from the rear of the queue
    void deque() {
        if (isEmpty()) {
            System.out.println("Queue is empty !!");
            return;
        }
        llist.removeFirst();
    }

    // Method getFront() returns front Element of the Queue
    int getFront() {
        if (!isEmpty()) {
            return llist.getFirst();
        }
        System.out.println("Queue is empty!!");
        return 0;
    }

    // Method getRear() returns rear Element of the Queue
    int getRear() {
        if (!isEmpty()) {
            return llist.getLast();
        }
        System.out.println("Queue is empty!!");
        return 0;
    }

    // Method to print Queue
    void printQueue() {
        for (int i : llist) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
