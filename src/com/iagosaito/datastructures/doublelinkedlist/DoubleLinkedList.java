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

    }

    public void add(int position, Object element) {

    }

    public Node get(int position) {
        return null;
    }

    private boolean isValidPosition(int position) {
        return false;
    }

    public void removeAtTheBeginning() {

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
