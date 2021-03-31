package com.ks.learning.hashtables;

import com.ks.learning.model.Employee;

public class Main {

    public static void main(String[] args){
//        SimpleHashTable hashTable = new SimpleHashTable();
        ChainedHashTable hashTable = new ChainedHashTable();
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        hashTable.put("Jones", janeJones);
        hashTable.put("Doe", johnDoe);
        hashTable.put("Willson", mikeWilson);
        hashTable.put("smith", marySmith);

        hashTable.printHashTable();

        System.out.println(hashTable.get("smith"));

        System.out.println("Deleted employee "+hashTable.remove("smith"));

        hashTable.printHashTable();

    }
}
