/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab7;

/**
 *
 * @author Akhil
 */
import java.util.*;
public class Fibonacci {
  long fib (int  n) 
    {  
        if (n<=1) 
            return 0;
        else if(n==2||n==3)
            return 1;
        else
            return (fib(n-1)  + fib (n-2) );
    }
    public static void main (String arg [ ]) 
    {
        Fibonacci f= new Fibonacci ( );
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term");
        int term=sc.nextInt();
        long num;
        num = f.fib (term);
        System.out.println (term+"th Fibonacci number is : "+num); 
    }    
}
