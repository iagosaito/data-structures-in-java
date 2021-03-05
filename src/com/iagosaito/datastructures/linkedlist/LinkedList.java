package com.iagosaito.datastructures.linkedlist;

public class LinkedList {

    private Node node = null;
    private Node lastNode = null;
    private int totalOfElements = 0;

    public void addAtTheBeginning(Object element) {


        final Node node = new Node(element, this.node);

        if (totalOfElements == 0) {
            this.lastNode = node;
        }

        this.node = node;
        totalOfElements++;
    }

    /**
     * Algoritmo com complexidade O(n), visto que para adicionar um elemento no final,
     * teríamos que percorrer todos os nós até encontrar o último
     */
    @Deprecated
    public void addInTheEndDeprecated(Object element) {

        Node node = this.node;

        if (node == null) {
            addAtTheBeginning(element);
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

    public void addInTheEnd(Object element) {
        final Node node = new Node(element, null);

        this.lastNode.setNext(node);
        this.lastNode = node;

        totalOfElements++;
    }

    public void add(int position, Object element) {

        if (position == 0) {
            addAtTheBeginning(element);
        } else if (position == totalOfElements){
            addInTheEnd(element);
        } else {
            Node node = get(position - 1);

            Node newNode = new Node(element, node.getNext());
            node.setNext(newNode);

            totalOfElements++;
        }
    }

    public Node get(int position) {

        if (!isValidPosition(position)) {
            throw new IllegalArgumentException("Invalid position!!");
        }

        Node node = this.node;
        for (int i = 0; i < position; i++) {
            node = node.getNext();
        }

        return node;
    }

    private boolean isValidPosition(int position) {
        return position >= 0 && position < totalOfElements;
    }

    public void removeAtTheBeginning() {
        if (totalOfElements == 0) {
            throw new IllegalArgumentException("you cannot remove an element in an empty list");
        }

        this.node = this.node.getNext();

        totalOfElements--;

        if (totalOfElements == 0) {
            this.lastNode = null;
        }
    }

    public void remove(int position) {

    }

    public int size() {
        return totalOfElements;
    }

    public boolean exists(Object element) {

        Node node = this.node;

        while (node != null) {
            if (node.getElement().equals(element)) {
                return true;
            }

            node = node.getNext();
        }

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
