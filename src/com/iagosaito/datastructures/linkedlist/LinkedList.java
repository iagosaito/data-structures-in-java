package com.iagosaito.datastructures.linkedlist;

public class LinkedList {

    private Node node = null;
    private int totalOfElements = 0;

    public void addAtBeginning(Object element) {

        this.node = new Node(element, node);
        totalOfElements++;
    }

    /**
     * Algoritmo com complexidade O(n), visto que para adicionar um elemento no final,
     * teríamos que percorrer todos os nós até encontrar o último
     */
    public void addInTheEnd(Object element) {

        Node node = this.node;

        if (node == null) {
            addAtBeginning(element);
        } else {
            for (int i = 0; i < totalOfElements; i++) {
                if (node.getNext() == null) {
                    Node newNode = new Node(element, null);
                    node.setNext(newNode);
                } else {
                    node = node.getNext();
                }
            }
        }

        totalOfElements++;
    }

    public void add(int position, Object element) {

    }

    public Object get(int position) {
        return null;
    }

    public void remove() {

    }

    public int tamanho() {
        return 0;
    }

    public boolean exists(Object element) {
        return false;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        Node node = this.node;
        for (int i = 0; i < totalOfElements; i++) {
            stringBuilder.append(node.getElement()).append(", ");
            node = node.getNext();
        }

        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
