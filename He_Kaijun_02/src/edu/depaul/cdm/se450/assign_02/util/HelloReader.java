package edu.depaul.cdm.se450.assign_02.util;


import java.io.*;
import java.util.*;
public class HelloReader {
    public static ArrayList<String> readNames(int number)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        try {
            for( int i = 1; i <= number; ++i){
                System.out.print("Enter name " + i + " of " + number + ": ");
                list.add(reader.readLine());
            }
        }
        catch(Exception e) {
            System.out.println("something wrong");
        }

        return list;
    }
}
