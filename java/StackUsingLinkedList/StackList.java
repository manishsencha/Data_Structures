import java.util.LinkedList;

// Class for stack
public class StackList {
    private LinkedList<Integer> llist = new LinkedList<Integer>();

    // Method to push Integer into Stack and return the status
    boolean push(int x) {
        try {
            llist.add(x);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to get the top element of the Stack
    int peek() {
        try {
            return llist.getLast();
        } catch (Exception e) {
            System.out.println("Stack is empty!!");
            return -1;
        }
    }

    // Method to pop the top element from the stack
    boolean pop() {
        try {
            llist.removeLast();
            return true;
        } catch (Exception e) {
            System.out.println("Stack is empty!!");
            return false;
        }
    }

    // Method to check if the stack is empty
    boolean isEmpty() {
        return llist.isEmpty();
    }

}
