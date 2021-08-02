package edu.depaul.cdm.se450.assign_02;

import static java.lang.Integer.parseInt;
import edu.depaul.cdm.se450.assign_02.hello.hello;
import edu.depaul.cdm.se450.assign_02.util.HelloReader;


public class HelloRunner {

    public static void main(String[] args)
    {
            if (args.length == 2 && parseInt(args[1]) != 0) {

                hello hello = new hello(HelloReader.readNames(parseInt(args[1])));
                hello.useHelper();
            } else {
                System.out.println("Usage: HelloRunner <integer number of names>");
            }


    }
}
