package science;

import java.util.*;

public class queue {
    static class myQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void add(int value) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());

            }
            s2.push(value);
            while (s2.isEmpty()) {
                s1.push(s2.pop());
            }
            System.out.println("Element pushed");
        }

        public void delete() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            System.out.println("Element deleted is :" + s2.pop());
            while (!s2.isEmpty()) {
                s1.push(s2.pop());

            }

        }

        public void peek() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            System.out.println("Element peeked  is:" + s2.peek());
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

    }

    public static void main(String[] args) {

        myQueue q = new myQueue();
        q.add(23);
        q.add(45);
        q.add(78);
        q.delete();
        q.peek();

    }
}