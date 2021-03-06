package com.iagosaito.datastructures.linkedlist;

public class LinkedList {

    private Node firstNode = null;
    private Node lastNode = null;
    private int totalOfElements = 0;

    public void addAtTheBeginning(Object element) {


        final Node node = new Node(element, this.firstNode);

        if (totalOfElements == 0) {
            this.lastNode = node;
        }

        this.firstNode = node;
        totalOfElements++;
    }

    /**
     * Algoritmo com complexidade O(n), visto que para adicionar um elemento no final,
     * teríamos que percorrer todos os nós até encontrar o último
     */
    @Deprecated
    public void addInTheEndDeprecated(Object element) {

        Node node = this.firstNode;

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

        Node node = this.firstNode;
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

        this.firstNode = this.firstNode.getNext();

        totalOfElements--;

        if (totalOfElements == 0) {
            this.lastNode = null;
        }
    }

    public void remove(int position) {

        if (totalOfElements == 0) {
            throw new IllegalArgumentException("you cannot remove an element in an empty list");
        }

        if (position < 0 || position >= totalOfElements) {
            throw new IllegalArgumentException("invalid position!");
        }

        if (position == 0) {
            removeAtTheBeginning();
        } else {
            Node previousNode = get(position - 1);
            Node nodeToBeDeleted = previousNode.getNext();

            previousNode.setNext(nodeToBeDeleted.getNext());

            if (nodeToBeDeleted.getNext() == null) {
                this.lastNode = previousNode;
            }

            totalOfElements--;
        }

    }

    public int size() {
        return totalOfElements;
    }

    public boolean exists(Object element) {

        Node node = this.firstNode;

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
        Node node = this.firstNode;
        for (int i = 0; i < totalOfElements; i++) {
            stringBuilder.append(node.getElement()).append(", ");
            node = node.getNext();
        }

        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
