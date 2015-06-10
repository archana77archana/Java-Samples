/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_no;

import java.util.Scanner;

/**
 *
 * @author archana77
 */
public class Reverse_no {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int n, rev = 0;
        
        System.out.println("Enter the number to be reversed: ");
        n = in.nextInt();
        
        while(n > 0)
        {
            rev = rev*10 + n%10;
            n = n/10;
        }
        
        System.out.println("Reversed no.: "+rev);        
    }
    
}
