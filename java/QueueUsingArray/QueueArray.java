package QueueUsingArray;

// Class QueueArray
public class QueueArray {

    // Initialized essential variables
    private int front = 0, rear = 0, size = 0;

    // Initialized an array for queue
    private int queue[];

    // Constructor for the Queue with specified size
    QueueArray(int size) {
        this.size = size;
        queue = new int[size];
    }

    // Method isEmpty() returns true if the queue is empty else returns false
    boolean isEmpty() {
        return front == rear;
    }

    // Method isFull() returns true if the queue is full else returns false
    boolean isFull() {
        return rear == size;
    }

    // Method enque() insert element to the queue if the queue is not full
    void enque(int data) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return;
        }
        queue[rear++] = data;
    }

    // Method deque() deletes an element from the rear of the queue
    void deque() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return;
        }
        for (int i = front; i < rear; ++i) {
            queue[i] = queue[i + 1];
        }
        rear--;
    }

    // Method getFront() returns front Element of the Queue
    int getFront() {
        if(!isEmpty()){
            return queue[front];
        }
        System.out.println("Queue is Empty!!");
        return 0;
    }
    
    // Method getRear() returns rear Element of the Queue
    int getRear() {
        if(!isEmpty()){
            return queue[rear];
        }
        System.out.println("Queue is Empty!!");
        return 0;
    }

    // Method to print Queue
    void printQueue() {
        for (int i = front; i < rear; ++i) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}