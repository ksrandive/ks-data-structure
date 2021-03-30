package com.ks.learning.stacks;

import com.ks.learning.model.Employee;

public class Main {

    public static void main(String[] args){

        ArraysStack arraysStack = new ArraysStack(10);
        LinkedListStack linkedListStack = new LinkedListStack();
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        arraysStack.push(janeJones);
        arraysStack.push(johnDoe);
        arraysStack.push(marySmith);
        arraysStack.push(mikeWilson);

        arraysStack.printStack();
        System.out.println(arraysStack.size());

        arraysStack.pop();
        arraysStack.printStack();
        System.out.println(arraysStack.size());

        System.out.println(arraysStack.peek());
        System.out.println(arraysStack.size());

        System.out.println("----------------------------------------------------");

        linkedListStack.push(janeJones);
        linkedListStack.push(johnDoe);
        linkedListStack.push(marySmith);
        linkedListStack.push(mikeWilson);

        linkedListStack.printStack();
        System.out.println(linkedListStack.peek() + " Peeked item");
        linkedListStack.printStack();
        System.out.println(linkedListStack.pop() +" Popped item ");
        linkedListStack.printStack();
    }
}
