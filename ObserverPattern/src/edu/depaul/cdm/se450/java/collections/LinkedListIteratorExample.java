package edu.depaul.cdm.se450.java.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        List<String> pets = new LinkedList<>();
        ListIterator<String> iterator = pets.listIterator();
        iterator.add("Socks"); // Socks
        iterator.add("Fido"); // Socks Fido
        iterator.previous(); // Socks | Fido
        iterator.set("Tweety"); // Socks | Tweety


        System.out.println("List pet contains: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("List pet contains: ");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        ListIterator<String> newIterator = pets.listIterator();

        System.out.println("New iterator List pet contains: ");
        while(newIterator.hasNext()){
            System.out.println(newIterator.next());
        }

        System.out.println("List pet contains: ");
        while(newIterator.hasPrevious()){
            System.out.println(newIterator.previous());
        }

    }

}
