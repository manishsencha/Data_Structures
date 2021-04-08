package StackUsingArray;

public class Main {
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack();
        st.push(45);
        System.out.println("Top : " + st.peek());
        st.push(12);
        System.out.println("Top : " + st.peek());
        st.push(54);
        System.out.println("Top : " + st.peek());
        st.pop();
        System.out.println("Top : " + st.peek());
        st.pop();
        System.out.println("Top : " + st.peek());
        st.pop();
        System.out.println("Top : " + st.peek());
        st.pop();
        System.out.println("Top : " + st.peek());
        
    }

}