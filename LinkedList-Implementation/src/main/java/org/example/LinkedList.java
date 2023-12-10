package org.example;

//Linked List implementation
public class LinkedList<E> {
    public static class Node<E> {
        E data;
        Node next;
    }
    Node head;
    public void add(E data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null){
            head = node;
        }
        else {
            Node n = new Node();
            n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void showAll(){
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public void addAtFirst(E data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    public void addAt(int index, E data){
        Node node = new Node();
        node.data = data;
        if(index==0)
            addAtFirst(data);
        else {
            Node n = head;
            for (int i=0; i<index-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void remove(int index){
        if(index == 0)
            head = head.next;
        else{
            Node n = head;
            for (int i=0; i<index-1;i++){
                n = n.next;
            }
            Node temp = n.next;
            n.next = temp.next;
        }
    }

    public int length(){
        Node n = head;
        int length = 0;
        while (n.next != null){
            length++;
            n = n.next;
        }
        return length+1;
    }
}
