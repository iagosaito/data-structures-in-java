package com.iagosaito.datastructures.stack;

public class MainStack {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Iago");
        stack.push("Yara");
        stack.push("Denize");
        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}
