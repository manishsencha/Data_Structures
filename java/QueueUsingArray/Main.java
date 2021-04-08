package QueueUsingArray;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(10);
        System.out.println(queue.isEmpty()); // true
        queue.enque(4);
        queue.enque(5);
        queue.enque(6);
        System.out.println(queue.isEmpty()); // false
        queue.enque(7);
        queue.printQueue();
        queue.deque();
        queue.printQueue();
        queue.deque();
        queue.deque();
        queue.printQueue();
        queue.deque();
        System.out.println(queue.isEmpty()); // true
        for (int i = 0; i < 10; ++i) {
            queue.enque(new Random().nextInt(1000));
        }
        queue.printQueue();
    }
}
