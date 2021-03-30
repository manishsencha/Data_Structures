package LinkedList;

// Class for Node

class Node {
    int data;
    Node next;

    // Constructor to create a Node
    Node(int x) {
        data = x;
        next = null;
    }
}

// Class LinkedList
public class LinkedList {

    private Node head = null, tail = null, temp;

    // Method to add a Node to LinkedList
    public void addNode(int x) {
        // Created a Node with data x
        temp = new Node(x);
        // Base condition ie., the List is empty
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = tail.next;
        }
    }

    // Method to check if the list is empty
    boolean isEmpty() {
        return head == null;
    }

    // Method to delete first node
    void deleteFront() {
        // Base condition ie., the List is empty
        if (isEmpty()) {
            System.out.println("List is empty! Nothing to delete !!");
        }
        head = head.next;
    }
    // Method to delete first node with data x
    void deleteOneNode(int x) {
        temp = head;
        if (isEmpty()) {
            System.out.println("List is empty! Nothing to delete !!");
        }
        if (temp.data == x) {
            head = head.next;
            return;
        }
        Node prevptr = head;
        while (temp != null) {
            if (temp.data == x) {
                prevptr.next = temp.next;
                break;
            }
            prevptr = temp;
            temp = temp.next;
            if (temp == null) {
                System.out.println("The element you want to delete doesn't exist in List !!");
            }
        }
    }

    // Method to delete all recurrence Nodes with data x
    void deleteAll(int x){
        temp = head;
        if (isEmpty()) {
            System.out.println("List is empty! Nothing to delete !!");
        }
        if (temp.data == x) {
            head = head.next;
            return;
        }
        Node prevptr = head;
        while (temp != null) {
            if (temp.data == x) {
                prevptr.next = temp.next;
            }
            prevptr = temp;
            temp = temp.next;
            if (temp == null) {
                System.out.println("The element you want to delete doesn't exist in List !!");
            }
        }
    }
    // Method to print the list
    void printList() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}