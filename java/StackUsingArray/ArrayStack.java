package StackUsingArray;

// Implementation of Stack Using Array;

public class ArrayStack {
    private int max = 10000; // max size of stack
    private int[] arr = new int[max]; // Initialized array for stack
    private int top = -1; // Assigning a index in the array for top

    // Method peek() returns top value from the stack;
    int peek() {
        if (top == -1) {
            System.out.println("Stack UnderFlow!");
            return 0;
        } else {
            return arr[top];
        }
    }

    // Method pop() pops top element from the stack if possible ie., If the stack is
    // not empty
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }

    // Method isEmpty() return true if Stack is empty and false if Stack is not
    // empty
    
    boolean isEmpty() {
        return (top == -1);
    }

    // Method returns true if the Integer is pushed in the stack and false if the
    // stack is full and the Integer is not pushed
    boolean push(int x) {
        if (x == (max - 1)) {
            System.out.println("Stack Overflow!");
            return false;
        }
        arr[++top] = x;
        return true;
    }
}
