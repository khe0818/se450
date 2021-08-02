package edu.depaul.cdm.se450.java.collections;

import java.util.Vector;

public class VectorExample {

    private Vector<String> progLanguages = new Vector<>();

    public static void main(String[] args) {

        VectorExample vectorExample = new VectorExample();
        System.out.println("Capacity of progLanguages is " + vectorExample.progLanguages.capacity());

        vectorExample.progLanguages.add("Java");
        vectorExample.progLanguages.add("C++");
        vectorExample.progLanguages.add("Ruby");
        vectorExample.progLanguages.add("Go");
        vectorExample.progLanguages.add("PHP");

        //print all elements in array list
        printCollectionInfo(vectorExample.progLanguages);

        //Remove an element
        vectorExample.progLanguages.remove("PHP");
        printCollectionInfo(vectorExample.progLanguages);


        //add a a specific index
        vectorExample.progLanguages.add(0,"C");
        printCollectionInfo(vectorExample.progLanguages);

        //add element 0 again
        vectorExample.progLanguages.add(0, "COBOL");
        printCollectionInfo(vectorExample.progLanguages);

        //remove index 0 element
        vectorExample.progLanguages.remove(0);
        printCollectionInfo(vectorExample.progLanguages);


    }

    static public void printCollectionInfo(Vector progLanguages){

        System.out.println(progLanguages);
        System.out.println(progLanguages.capacity());
        progLanguages.trimToSize();
        System.out.println(progLanguages.capacity());

    }

}
