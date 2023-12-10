package org.example;

// Stack implementation
public class Stack <E>{
    Object[] stack;
    int top = 0;
    int capacity = 0;
    public Stack(int initialCapacity){
        this.capacity = initialCapacity;
        this.stack = new Object[initialCapacity];
    }

    public void push(E data){
        if(size()==capacity-1){
            grow();
            stack[top] = data;
            top++;
        }
        else {
            stack[top] = data;
            top++;
        }
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            stack[top] = 0;
            top--;
        }
        return stack[top];
    }

    public Object peek(){
        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public void grow(){
        Object[] temp = new Object[capacity+5];
        for(int i=0; i<top; i++){
            temp[i] = stack[i];
        }
        this.stack = temp;
    }

    public void show(){
        for(int i=0;i<top;i++) {
            System.out.println(stack[i]);
        }
    }
}
