package edu.depaul.cdm.se450.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample
{

    public static void main(String args[]) {

        /* Declare HashMap */
        HashMap<Integer, String> progLangMap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        progLangMap.put(1, "C");
        progLangMap.put(2, "COBOL");
        progLangMap.put(3, "C++");
        progLangMap.put(46, "Java");
        progLangMap.put(45, "Java");
        progLangMap.put(5, "F#");
        progLangMap.put(5, "List");
        progLangMap.put(6, null );

        /* Display content using Iterator*/
        Set set = progLangMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        /* Get values based on index*/
        String var= progLangMap.get(2);
        System.out.println("Value at index 2 is: "+var);

        var= progLangMap.get(4);
        System.out.println("Value at index 4 is: "+var);

        var= progLangMap.get(5);
        System.out.println("Value at index 5 is: "+var);

        /* Display content using Iterator*/
        set = progLangMap.entrySet();
        iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        /* Remove values based on key*/
        progLangMap.remove(1);
        System.out.println("Map key and values after removal:");
        Set set2 = progLangMap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

    }
}