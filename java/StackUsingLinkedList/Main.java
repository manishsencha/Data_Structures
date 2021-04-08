package StackUsingLinkedList;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StackList st = new StackList();
        for (int i = 0; i < 5; ++i) {
            st.push(new Random().nextInt(1000));
            System.out.println(st.peek());
        }
        System.out.println(st.isEmpty());

        System.out.println(st.peek());

        System.out.println();
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
