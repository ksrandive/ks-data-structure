package com.ks.learning.queues;

import com.ks.learning.model.Employee;

import java.util.NoSuchElementException;

public class ArraysQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArraysQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        if(size() == queue.length - 1){
            Employee[] newQueue = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }
        queue[back] = employee;
        if(back < queue.length){
            back++;
        }else {
            back = 0;
        }

        back++;
    }

    public Employee remove(){
        if(size() == 0)
            throw new NoSuchElementException();

        Employee employee = queue[front];
        queue[front] = null;
        front++;

        if(size() == 0){
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek(){
        if(size() == 0)
            throw new NoSuchElementException();

        return queue[front];
    }

    public int size(){
        return back - front;
    }

    public void printQueue(){
        for(int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }
}
