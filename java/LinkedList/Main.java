package LinkedList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 0; i < 100; ++i) {
            list.addNode(new Random().nextInt(100));
        }
        list.printList();
        list.deleteFront();
        list.printList();
        list.deleteOneNode(9);
        list.deleteOneNode(6);
        list.deleteOneNode(63);
        list.printList();
        list.deleteAll(3);
        list.printList();
    }
}
