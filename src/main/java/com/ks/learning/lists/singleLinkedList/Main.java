package com.ks.learning.lists.singleLinkedList;

import com.ks.learning.model.Employee;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeSingleLinkedList employeeSingleLinkedList = new EmployeeSingleLinkedList();
        System.out.println(employeeSingleLinkedList.isEmpty());

        employeeSingleLinkedList.addToFront(janeJones);
        employeeSingleLinkedList.addToFront(johnDoe);
        employeeSingleLinkedList.addToFront(marySmith);
        employeeSingleLinkedList.addToFront(mikeWilson);

        System.out.println(employeeSingleLinkedList.getSize());
        employeeSingleLinkedList.printList();

        employeeSingleLinkedList.removeFromFront();
        System.out.println(employeeSingleLinkedList.getSize());
        employeeSingleLinkedList.printList();
    }
}
