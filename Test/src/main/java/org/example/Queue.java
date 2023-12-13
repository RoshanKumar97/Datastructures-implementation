package org.example;

public class Queue<E> {
    int front = 0;
    int rear = 0;
    int size = 0;
    int initialQueueSize;
    Object[] queue;

    public  Queue(int initialQueueSize){
        this.initialQueueSize = initialQueueSize;
        this.queue = new Object[initialQueueSize];
    }

    public void enQueue( E data ) {
        queue[rear] = data;
        rear = (rear + 1) % initialQueueSize;
        size++;
    }
    public Object deQueue() {
        Object data = queue[front];
        front = (front + 1) % initialQueueSize;
        size--;
        return data;
    }

    public void show(){
        for (int i = 0; i < size; i++){
            System.out.println(queue[(front+i) % initialQueueSize]+" ");
        }
    }
}
