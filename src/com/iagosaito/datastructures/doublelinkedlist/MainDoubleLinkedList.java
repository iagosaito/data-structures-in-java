package com.iagosaito.datastructures.doublelinkedlist;

public class MainDoubleLinkedList {

    public static void main(String[] args) {
        final DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.addInTheEnd("Everton Ribeiro");
        System.out.println(doubleLinkedList);
        doubleLinkedList.addAtTheBeginning("Pelé");
        doubleLinkedList.addAtTheBeginning("Jair");
        doubleLinkedList.addAtTheBeginning("Bonoro");
        System.out.println(doubleLinkedList);

        doubleLinkedList.removeAtTheBeginning();
        System.out.println(doubleLinkedList);
        doubleLinkedList.removeAtTheBeginning();
        System.out.println(doubleLinkedList);
        doubleLinkedList.removeAtTheBeginning();
        System.out.println(doubleLinkedList);
        doubleLinkedList.removeAtTheBeginning();
        System.out.println(doubleLinkedList);
    }

}
