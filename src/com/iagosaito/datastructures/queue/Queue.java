package com.iagosaito.datastructures.queue;

import java.util.LinkedList;
import java.util.List;

public class Queue {

    private List<Object> linkedList = new LinkedList<>();

    public void add(Object element) {
        linkedList.add(element);
    }

    public Object poll() {
        return linkedList.remove(0);
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
