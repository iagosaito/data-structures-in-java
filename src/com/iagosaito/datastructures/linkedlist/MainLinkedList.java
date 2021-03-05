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

        linkedList.addInTheEnd("Último");
        System.out.println(linkedList.toString());
        linkedList.addInTheEnd("Depois do último");
        System.out.println(linkedList.toString());
    }
}
