/*

Author: Archana K C
FileName: IntOps.java

Compilation:  javac IntOps.java
Execution:    java IntOps a b

*/

public class IntOps { 

    public static void main(String[] args) {
    
        //Storing inputs in variables
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        //Operations
        
        int sum  = a + b;
        int prod = a * b;
        int quot = a / b;
        int rem  = a % b;
        
        //Printing

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + quot + " * " + b + " + " + rem);
    }
}
