package edu.depaul.cdm.se450.java.collections;

import java.util.HashSet;


public class HashSetExample {
    public static void main(String args[]) {

        // HashSet declaration
        HashSet<String> hset =
                new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("C++");
        hset.add("Java");
        hset.add("COBOL");
        hset.add("Python");
        hset.add("PHP");

        //Addition of duplicate elements
        hset.add("F#");
        hset.add("F#");


        //we can add null values
        hset.add(null);
        hset.add(null);

        //Display
        System.out.println(hset);
    }
}