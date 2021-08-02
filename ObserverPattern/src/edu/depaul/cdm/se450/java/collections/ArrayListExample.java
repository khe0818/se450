package edu.depaul.cdm.se450.java.collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> progLanguages = new ArrayList<>();

        progLanguages.add("Java");
        progLanguages.add("C++");
        progLanguages.add("Ruby");
        progLanguages.add("Go");
        progLanguages.add("PHP");

        //print all elements in array list
        System.out.println(progLanguages);

        //Remove an element
        progLanguages.remove("PHP");
        System.out.println(progLanguages);

        //add a a specific index
        progLanguages.add(0,"C");
        System.out.println(progLanguages);

        //add element 0 again
        progLanguages.add(0, "COBOL");
        System.out.println(progLanguages);

        //remove index 0 element
        progLanguages.remove(0);
        System.out.println(progLanguages);

    }
}
