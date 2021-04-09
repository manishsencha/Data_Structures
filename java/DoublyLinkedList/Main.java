package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dllist = new DoublyLinkedList();
        dllist.addFront(4);
        dllist.addFront(6);
        dllist.addFront(7);
        dllist.addFront(8);
        dllist.addFront(9);
        dllist.addFront(1);
        dllist.addFront(5);

        dllist.printListForward(); // 5 1 9 8 7 6 4

        dllist.printListReverse(); // 4 6 7 8 9 1 5
        dllist.removeFront();
        dllist.printListForward(); // 1 9 8 7 6 4
        dllist.removeLast();
        dllist.printListForward(); // 1 9 8 7 6
        dllist.printListReverse(); // 6 7 8 9 1
        dllist.removeKey(8);
        dllist.printListForward(); // 1 9 7 6
        dllist.removeKey(1);
        dllist.printListForward(); // 9 7 6
        dllist.removeKey(6);
        dllist.printListForward(); // 9 7
    }
}

/****** Output ********/

// 5 1 9 8 7 6 4
// 4 6 7 8 9 1 5
// 1 9 8 7 6 4
// 1 9 8 7 6
// 6 7 8 9 1
// 1 9 7 6
// 9 7 6
// 9 7