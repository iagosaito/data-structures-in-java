package com.iagosaito.datastructures.set;


import java.util.ArrayList;
import java.util.LinkedList;

public class Set {

    private ArrayList<LinkedList<String>> table = new ArrayList<LinkedList<String>>();

    public Set() {
        for (int i = 0; i < 26; i++) {
            table.add(new LinkedList<>());
        }
    }

    public void insert(String element) {
        if (!exists(element)) {
            final int indexOfTable = getIndexOfTable(element);
            LinkedList<String> linkedList = table.get(indexOfTable);
            linkedList.add(element);
        }
    }

    public void remove(String element) {
        table.get(getIndexOfTable(element)).remove(element);
    }

    public boolean exists(String element) {
        return table.get(getIndexOfTable(element)).contains(element);
    }

    private int getIndexOfTable(String element) {
        return element.toLowerCase().charAt(0) % 26;
    }

    @Override
    public String toString() {
        return table.toString();
    }
}
