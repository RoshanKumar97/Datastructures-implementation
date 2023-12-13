package org.example;


//Queue implementation
public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>(5);

        integerQueue.enQueue(1);
        integerQueue.enQueue(2);
        integerQueue.enQueue(3);
        integerQueue.enQueue(4);

        System.out.println("Dequeued Element: "+integerQueue.deQueue());

        integerQueue.enQueue(5);
        integerQueue.enQueue(6);

        integerQueue.show();
    }
}