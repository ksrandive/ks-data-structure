package com.ks.learning.lists.doubleLinkedList;

import com.ks.learning.lists.singleLinkedList.EmployeeSingleLinkedList;
import com.ks.learning.model.Employee;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoubleLinkedList employeeDoubleLinkedList = new EmployeeDoubleLinkedList();
        System.out.println(employeeDoubleLinkedList.isEmpty());

        employeeDoubleLinkedList.addToFront(janeJones);
        employeeDoubleLinkedList.addToFront(johnDoe);
        employeeDoubleLinkedList.addToFront(marySmith);
        employeeDoubleLinkedList.addToFront(mikeWilson);

        System.out.println(employeeDoubleLinkedList.getSize());
        employeeDoubleLinkedList.printList();

        Employee billEnd = new Employee("bill", "End", 1);
        employeeDoubleLinkedList.addToEnd(billEnd);
        System.out.println(employeeDoubleLinkedList.getSize());
        employeeDoubleLinkedList.printList();

        employeeDoubleLinkedList.removeFromFront();
        System.out.println(employeeDoubleLinkedList.getSize());
        employeeDoubleLinkedList.printList();

        employeeDoubleLinkedList.removeFromEnd();
        System.out.println(employeeDoubleLinkedList.getSize());
        employeeDoubleLinkedList.printList();
    }
}
