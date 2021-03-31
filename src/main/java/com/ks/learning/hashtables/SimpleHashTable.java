package com.ks.learning.hashtables;

import com.ks.learning.model.Employee;

public class SimpleHashTable {

    private StoredEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

    public void put(String key, Employee value) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }
        if (hashTable[hashedKey] != null) {
            System.out.println("The array is full " + hashedKey);
        } else {
            hashTable[hashedKey] = new StoredEmployee(key, value);
        }
    }

    private int getKey(String key) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equalsIgnoreCase(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equalsIgnoreCase(key)) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }

        if(hashTable[hashedKey] != null && hashTable[hashedKey].key.equalsIgnoreCase(key)){
            return hashedKey;
        }
        else{
            return -1;
        }
    }

    public Employee get(String key) {
        int hashedKey = getKey(key);
        if(hashedKey == -1){
            return null;
        }
        return hashTable[hashedKey].employee;
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if(hashTable[i] ==  null){
                System.out.println("empty place");
            }else{
                System.out.println("Position : "+i+ " employee : " +hashTable[i].employee);
            }
        }
    }

    public Employee remove(String key){
        int hashedKey = getKey(key);
        if(hashedKey == -1){
            return null;
        }
        Employee employee = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;
        return employee;
    }
    private boolean occupied(int key) {
        return hashTable[key] != null;
    }
}
