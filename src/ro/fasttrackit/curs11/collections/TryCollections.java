package ro.fasttrackit.curs11.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TryCollections {
    public static void main(String[] args) {
        tryStack();
        tryQueue();
    }

    private static void tryStack() {
        System.out.println("----- STACK");
        Stack<String> myStack = new Stack<>();
        myStack.push("first");
        myStack.push("second");
        myStack.add("3rd");

        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack);
//        System.out.println(myStack.pop()); // arunca exceptie daca nu exista element
    }

    private static void tryQueue() {
        System.out.println("----- QUEUE");
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("first");
        myQueue.add("second");
        myQueue.add("3rd");

        System.out.println(myQueue);
        System.out.println(myQueue.remove());
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
        System.out.println(myQueue.poll()); // nu mai este in coada
        System.out.println(myQueue);
//        System.out.println(myQueue.remove()); // nu mai este in coada, exceptie!
    }
}
