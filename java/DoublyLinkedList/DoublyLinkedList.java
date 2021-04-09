package DoublyLinkedList;

// Class Node
class Node {
    int data;
    Node prev;
    Node next;

    // Costructor for Node
    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

// Class DoublyLinkedList

public class DoublyLinkedList {
    // Initialized head and tail to null
    private Node head = null;
    private Node tail = null;

    // Method returns true if list is empty and false otherwise
    boolean isEmpty() {
        return head == null;
    }

    // Method adds an element in front of the list
    void addFront(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    // Method adds an element at the last of the list
    void addTail(int data) {
        Node temp = new Node(data);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    // Method prints list iterating in forward direction
    void printListForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method prints list iterating in reverse direction
    void printListReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Method returns size of the list
    int getSize() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // Method returns front element of the list and if it doesn't exists returns 0
    int getFront() {
        if (isEmpty()) {
            System.out.println("List is Empty!!");
            return 0;
        }
        return head.data;
    }

    // Method returns last element of the list and if it doesn't exists returns 0
    int getLast() {
        if (isEmpty()) {
            System.out.println("List is Empty!!");
            return 0;
        }
        return tail.data;
    }

    // Method removes front element of the list if exists
    void removeFront() {
        if (isEmpty()) {
            System.out.println("List is Empty!!");
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Method removes last element of the list if exists
    void removeLast() {
        if (isEmpty()) {
            System.out.println("List is Empty!!");
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    // Removes particular element with the key
    void removeKey(int key) {
        if (isEmpty()) {
            System.out.println("List is Empty!!");
        } else if (head.data == key) {
            removeFront();
        } else if (tail.data == key) {
            removeLast();
        } else {

            Node temp = head;
            while (temp.data != key) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
}