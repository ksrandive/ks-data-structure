package com.ks.learning.stacks;

import com.ks.learning.model.Employee;

import java.util.EmptyStackException;

public class ArraysStack {

    public Employee[] stack;
    public int top;

    public ArraysStack(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee employee){

        if(top == stack.length){
            //need to resize the array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public Employee pop(){
        if(isEmpty())
            throw new EmptyStackException();

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return stack[top - 1];
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for(int i = top - 1; i >= 0 ; i --){
            System.out.println(stack[i]);
        }
    }
    public boolean isEmpty(){
        return top == 0;
    }

}
