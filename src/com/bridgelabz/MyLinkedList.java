package com.bridgelabz;

public class MyLinkedList {

    private Node head;

    // Push Method
    public void push(int data) {


        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // Pop Method
    public int pop() {

        if(head == null) {
            System.out.println("Stack Is Empty !");
            return 0;
        }
        Node temp = head;
        head = temp.next;
        return temp.key;
    }

    // Peak Method
    public void peak() {

        if(head == null) {
            System.out.println("Stack Is Empty !");
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println("\nPeak Element : " +temp.key);
        }
    }

    //Enqueue Method
    public boolean enqueue(int data) {

        boolean add = false;
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            add = true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            add = true;
        }
        return add;
    }

    // Print Method
    public void print() {

        Node temp = head;
        System.out.print("Queue : ");

        while (temp != null) {
            System.out.print(temp.key +"->");
            temp = temp.next;
        }
        System.out.println();
    }
}
