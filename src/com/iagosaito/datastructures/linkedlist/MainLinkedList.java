package com.iagosaito.datastructures.linkedlist;

public class MainLinkedList {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addAtBeginning("Iago");
        System.out.println(linkedList.toString());
        linkedList.addAtBeginning("Felipe");
        System.out.println(linkedList.toString());
        linkedList.addAtBeginning("Giovani");
        System.out.println(linkedList.toString());

        linkedList.addInTheEnd("Final");
        linkedList.addInTheEnd("Depois do Final");
        System.out.println(linkedList.toString());

        linkedList.addAtBeginning("Começo");
        System.out.println(linkedList.toString());
    }
}
