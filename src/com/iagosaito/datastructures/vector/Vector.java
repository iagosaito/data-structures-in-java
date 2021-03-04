package com.iagosaito.datastructures.vector;

import java.util.Arrays;

public class Vector {

    private Student[] students = new Student[10];
    private int totalOfElements = 0;

    private void provideSpace() {
        if (totalOfElements == students.length) {
            Student[] newVectorOfStudents = new Student[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newVectorOfStudents[i] = students[i];
            }

            students = newVectorOfStudents;
        }
    }

    public void add(Student student) {
        provideSpace();
        students[totalOfElements] = student;
        totalOfElements++;
    }

    public void add(int position, Student student) {
        provideSpace();
        if (position < 0 || position > totalOfElements) {
            throw new IllegalArgumentException("invalid position!");
        }

        for (int i = totalOfElements - 1; i >= position; i--) {
            students[i+1] = students[i];
        }

        students[position] = student;
        totalOfElements++;
    }

    public void remove(int position) {

        for (int i = position; i < totalOfElements - 1; i++) {
            students[i] = students[i+1];
        }

        totalOfElements--;
        students[totalOfElements] = null;
    }

    public Student get(int position) {
        if (position < 0 || position > totalOfElements - 1) {
            throw new IllegalArgumentException("invalid position!");
        }

        return students[position];
    }

    public boolean exists(Student student) {
        for (int i = 0; i < totalOfElements; i++) {
            if (students[i].equals(student)) {
                return true;
            }
        }

        return false;
    }

    public int totalOfElements() {
        return totalOfElements;
    }

    @Override
    public String toString() {
        return Arrays.toString(students);
    }
}
