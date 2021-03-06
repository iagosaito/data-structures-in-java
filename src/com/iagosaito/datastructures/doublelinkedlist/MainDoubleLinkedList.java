package com.iagosaito.datastructures.doublelinkedlist;

public class MainDoubleLinkedList {

    public static void main(String[] args) {
        final DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.addAtTheBeginning("Maria");
        System.out.println(doubleLinkedList);

        doubleLinkedList.addInTheEnd("João");
        System.out.println(doubleLinkedList);

        doubleLinkedList.add(1, "José");
        System.out.println(doubleLinkedList);

        doubleLinkedList.removeAtTheBeginning();
        System.out.println(doubleLinkedList);

        doubleLinkedList.add(2, "Antonio");
        System.out.println(doubleLinkedList);

        doubleLinkedList.remove(1);
        System.out.println(doubleLinkedList);

        System.out.println(doubleLinkedList.exists("Antonio"));
        System.out.println(doubleLinkedList.exists("Filadelfo"));
    }

}
