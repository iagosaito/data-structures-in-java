package com.iagosaito.datastructures.queue;

public class MainQueue {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add("Iago");
        queue.add("Fabrício");
        queue.add("Marcos");
        queue.add("Miranda");
        System.out.println(queue.toString());
        final Object obj = queue.poll();
        System.out.println(obj);
        System.out.println(queue);
        final Object obj2 = queue.poll();
        System.out.println(obj2);
        System.out.println(queue);
        final Object obj3 = queue.poll();
        System.out.println(obj3);
        System.out.println(queue);
    }
}
