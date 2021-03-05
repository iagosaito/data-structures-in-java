package com.iagosaito.datastructures.vector;

public class MainVector {

    public static void main(String[] args) {

        Student p1 = new Student("Iago");
        Student p2 = new Student("Saito");
        Student p3 = new Student("Gabriel");

        final Vector vector = new Vector();

        vector.add(p1);
        vector.add(p2);
        vector.add(2, p3);

        System.out.println(vector.exists(p3));
        System.out.println(vector.toString());
        System.out.println(vector.size());
        System.out.println(vector.get(2));

        System.out.println("\nRemove element!!");

        vector.remove(0);
        System.out.println(vector.toString());

        for (int i = 0; i <= 300; i++) {
            Student s1 = new Student("Iago " + i);
            vector.add(s1);
        }

        System.out.println(vector.toString());
    }

}
