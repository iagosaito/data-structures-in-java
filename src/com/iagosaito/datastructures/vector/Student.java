package com.iagosaito.datastructures.vector;

public class Student {

    private String nome;

    public Student(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Student student = (Student) obj;
        return student.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
