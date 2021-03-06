package com.iagosaito.datastructures.stack;

import java.util.LinkedList;
import java.util.List;

public class Stack {

    List<Object> linkedList = new LinkedList<>();

    public void push(Object element) {
        linkedList.add(element);
    }

    public Object pop() {
        return linkedList.remove(linkedList.size() - 1);
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
