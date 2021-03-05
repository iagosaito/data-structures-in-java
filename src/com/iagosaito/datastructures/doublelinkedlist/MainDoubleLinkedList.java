package com.iagosaito.datastructures.doublelinkedlist;

import java.util.LinkedList;

public class MainDoubleLinkedList {

    public static void main(String[] args) {
        final DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.addAtTheBeginning("Iago Saito");
        doubleLinkedList.addAtTheBeginning("Felipe Massa");
        doubleLinkedList.addAtTheBeginning("Carlos Pietro");

        System.out.println(doubleLinkedList);
    }

}
