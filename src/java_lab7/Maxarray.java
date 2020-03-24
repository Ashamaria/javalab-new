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
public class Maxarray {
    void Maximum(int a[], int low, int n) 
    { 
       int max= a[0]; 
       int i; 
       for (i=low;i<=n;i++) 
       { 
           if (a[i] > max) 
              max = a[i]; 
       } 
       System.out.println("Maximum element int the array is "+ max); 
    } 
    public static void main (String[] args)  
    { 
        int n;
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array limit");
        n=sc.nextInt();
        System.out.println("Enter "+ n +" array elements");
        for (int i=1; i <=n;i++) 
        {
            a[i]=sc.nextInt(); 
        }
        Maxarray ma=new Maxarray();
        ma.Maximum(a,1,n); 
    }  
} 

