package se450.homework1;
/*
for my choice of tool is intellij idea, when opening up intellij idea with my project, then
go to view and select tools window and select terminal
Step one:
javac se450/homework1/HelloRunner.java
to compile java file
Step two: testing
java se450.homework1.HelloRunner se450
output is
This is your HelloHelper speaking...
Hello se450!
Step Two: testing second case
java se450.homework1.HelloRunner
output is
Usage: HelloRunner <name>


 */
public class HelloRunner{
    public static String Hello;


    public static void useHelper(){
        System.out.println("This is your HelloHelper speaking...");

    }

    public static void sayHello(){
        System.out.println("Hello " + Hello + "!");

    }


    public static void main(String[] args){


        if(args.length == 0) {
            System.out.println("Usage: HelloRunner <name>");
            System.exit(0);
        }
        else {
            Hello = args[0];
            useHelper();
            sayHello();

        }
    }


}
