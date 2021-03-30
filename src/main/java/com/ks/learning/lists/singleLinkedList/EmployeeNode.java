package com.ks.learning.lists.singleLinkedList;

import com.ks.learning.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public String toString(){
        return employee.toString();
    }
}
