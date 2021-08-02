package edu.depaul.cdm.se450.java.collections;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {

        /*
         * We cannot create instance of a Queue as it is an
         * interface, we can create instance of LinkedList or
         * PriorityQueue and assign it to Queue
         */
        Queue<String> proLangQueue = new LinkedList<>();

        //Adding elements to the Queue
        proLangQueue.add("C++");
        proLangQueue.add("F#");
        proLangQueue.add("COBOL");
        proLangQueue.add("Java");
        proLangQueue.add("FORTRAN");

        System.out.println("Elements in Queue:"+proLangQueue);

        //removes first element
        System.out.println("Removed element: "+proLangQueue.remove());

        // returns the head of the queue
        System.out.println("Head: "+proLangQueue.element());


         //removes and returns the head of the Queue. Returns null if the Queue is empty
        System.out.println("poll(): "+proLangQueue.poll());

        //like element() but returns null if the Queue is empty
        System.out.println("peek(): "+proLangQueue.peek());

        //display
        System.out.println("Elements in Queue:"+proLangQueue);
    }
}