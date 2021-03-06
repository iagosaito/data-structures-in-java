package com.iagosaito.datastructures.doublelinkedlist;

public class DoubleLinkedList {

    private Node firstNode = null;
    private Node lastNode = null;
    private int totalOfElements = 0;

    public void addAtTheBeginning(Object element) {

        Node node = new Node(element, firstNode);

        if (totalOfElements == 0) {
            lastNode = node;
        } else {
            firstNode.setPrevious(node);
        }

        firstNode = node;

        totalOfElements++;
    }

    public void addInTheEnd(Object element) {

        if (totalOfElements == 0) {
            addAtTheBeginning(element);
        } else {
            Node node = new Node(element);
            node.setPrevious(lastNode);
            lastNode.setNext(node);

            lastNode = node;

            totalOfElements++;
        }

    }

    public void add(int position, Object element) {

    }

    public Node get(int position) {

        if (!isValidPosition(position)) {
            throw new IllegalArgumentException("invalid position!!");
        }

        Node node;
        if (position < (totalOfElements >> 1)) {
            node = firstNode;

            for (int i = 0; i < position; i++) {
                node = node.getNext();
            }
        } else {
            position = (totalOfElements - 1) - position;
            node = lastNode;

            for (int i = 0; i < position; i++) {
                node = node.getPrevious();
            }
        }

        return node;
    }

    private boolean isValidPosition(int position) {
        return position >= 0 && position < totalOfElements;
    }

    public void removeAtTheBeginning() {

        if (totalOfElements == 1) {
            firstNode = null;
            lastNode = null;
        } else {
            Node nextNode = firstNode.getNext();

            nextNode.setPrevious(null);

            firstNode = nextNode;
        }

        totalOfElements--;
    }

    public void remove(int position) {

    }

    public int size() {
        return totalOfElements;
    }

    public boolean exists(Object element) {
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
