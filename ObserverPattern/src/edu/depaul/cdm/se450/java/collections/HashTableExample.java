package edu.depaul.cdm.se450.java.collections;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableExample {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        // Create the Hashtable
        Hashtable<String, String> statesHashtable =
                new Hashtable<String, String>();

        // Adding Key/Value pairs to Hashtable
        statesHashtable.put("IL","SpringField");
        statesHashtable.put("IN","Indianapolis");
        statesHashtable.put("TN","Nashville");
        statesHashtable.put("NY","Albany");
        statesHashtable.put("TX","Austin");

        names = statesHashtable.keys();

        while(names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " +key+ " -- Value: " +
                    statesHashtable.get(key));
        }
    }
}