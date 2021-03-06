package com.iagosaito.datastructures.doublelinkedlist;

public class MainDoubleLinkedList {

    public static void main(String[] args) {
        final DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.addInTheEnd("Everton Ribeiro");
        System.out.println(doubleLinkedList);
        doubleLinkedList.addAtTheBeginning("Pelé");
        System.out.println(doubleLinkedList);

        System.out.println(doubleLinkedList.get(1));
    }

}
