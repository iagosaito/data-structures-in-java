package com.iagosaito.datastructures.linkedlist;

public class MainLinkedList {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addAtTheBeginning("Iago");
        System.out.println(linkedList.toString());
        linkedList.addAtTheBeginning("Felipe");
        System.out.println(linkedList.toString());
        linkedList.addAtTheBeginning("Giovani");
        System.out.println(linkedList.toString());

        linkedList.addInTheEnd("Matias");
        System.out.println(linkedList.toString());
        linkedList.addInTheEnd("Ítalo");
        System.out.println(linkedList.toString());

        System.out.println(linkedList.get(0));
        linkedList.addAtTheBeginning("Lautaro");
        System.out.println(linkedList.toString());
        System.out.println(linkedList.get(5));

        linkedList.removeAtTheBeginning();
        System.out.println(linkedList.toString());
        linkedList.removeAtTheBeginning();
        System.out.println(linkedList.toString());
        linkedList.removeAtTheBeginning();
        System.out.println(linkedList.toString());

        linkedList.add(0, "Francisco");
        System.out.println(linkedList.toString());

        System.out.println("=== Remove element in any position ===");
        linkedList.remove(3);
        System.out.println(linkedList.toString());
    }
}
