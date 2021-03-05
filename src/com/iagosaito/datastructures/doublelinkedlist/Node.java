package com.iagosaito.datastructures.doublelinkedlist;

import java.util.StringJoiner;

public class Node {

    private Object element;
    private Node previous;
    private Node next;

    public Node(Object element) {
        this(element, null);
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.element.toString();
    }
}
