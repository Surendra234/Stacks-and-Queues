package com.bridgelabz;

public class Queue {

    public static void main(String[] args) {

        System.out.println("\nWelcome To Queue Program");
        MyLinkedList queue = new MyLinkedList();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.print();
    }
}
