package org.example;


//Linked list implementation
public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(16);
        list.add(17);
        list.add(4);
        list.add(3);
        list.addAtFirst(1);
        list.addAt(2,11);
        list.remove(3);
        list.showAll();
        System.out.println("Lenght of the Linked list: "
                +list.length());
    }
}