package com.bridgelabz;

public class Stack{

    public static void main(String[] args) {

        System.out.println("\nWelcome To Stack Program");
        MyLinkedList stack = new MyLinkedList();

        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.print();
        stack.peak();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peak();
    }
}
