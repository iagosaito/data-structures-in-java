package com.iagosaito.datastructures.set;

public class MainSet {

    public static void main(String[] args) {
        Set set = new Set();

        set.insert("Iago");
        set.insert("Giovani");
        set.insert("Felipe");
        set.insert("Guilherme");
        set.insert("Istiminiano");
        set.insert("Aderbal");

        System.out.println(set.toString());

        set.remove("Aderbal");
        set.insert("Iago");
        System.out.println(set.toString());


    }

}