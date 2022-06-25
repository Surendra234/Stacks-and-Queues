package com.bridgelabz;

public class MyLinkedList {

    private Node head;

    // Push Method
    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // Print Method
    public void print() {
        Node temp = head;
        System.out.println("\nStack : ");

        while (temp != null) {
            System.out.print(temp.key +"->");
            temp = temp.next;
        }
        System.out.println();
    }
}
