package com.ks.learning.queues;

import com.ks.learning.model.Employee;

public class Main {

    public static void main(String[] args){

        ArraysQueue arraysQueue = new ArraysQueue(10);
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        arraysQueue.add(janeJones);
        arraysQueue.add(johnDoe);
        arraysQueue.add(marySmith);
        arraysQueue.add(mikeWilson);

        arraysQueue.printQueue();
        System.out.println(arraysQueue.remove() + " removed item");
        arraysQueue.printQueue();
        System.out.println(arraysQueue.peek() + " peek item");
        arraysQueue.printQueue();
    }
}
