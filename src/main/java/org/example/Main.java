package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addInTail(new Node(1));
//        linkedList.addInTail(new Node(3));
        linkedList.addInTail(new Node(2));
        linkedList.addInTail(new Node(3));
        linkedList.remove(3);
//
//        linkedList.removeAll(1);
//        linkedList.insertAfter(new Node(2), new Node(4));
        System.out.println("Hello world!");
    }
}