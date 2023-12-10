package org.example;


//Stack implementation
public class Main {
    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>(5);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(6);

        System.out.println("Popped element: " + integerStack.pop());
        System.out.println("Peeked element: " + integerStack.peek());
        System.out.println("Size of the stack: " + integerStack.size());
        System.out.println("isEmpty: " + integerStack.isEmpty());

        integerStack.show();

    }
}