/*program 12.2 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_12;

/**
 *
 * @author Akhil
 */
import java.util.*;
import java.io.*;
public class ConvertToUpper {
     public static void main(String[] args) throws IOException  
    {
        System.out.print("Enter number of characters:\t");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ByteArrayOutputStream f = new ByteArrayOutputStream(num); 
        System.out.println ("enter "+num+" characters ");
        while (f.size() !=num)
        {   
            f.write(System.in.read()); 
        }         
        byte b[] = f.toByteArray();
        System.out.println("Characters in the array");
        for(int l=0;l<b.length;l++)
        {
            System.out.print((char)b[l]); 
        } 
        ByteArrayInputStream inp = new ByteArrayInputStream(b);
        int c; 
        System.out.println("\n\nconverted to upper case characters");  
        for (int i=0;i<1;i++) 
        {  
            while((c=inp.read()) != -1)   
            { 
                System.out.print(Character.toUpperCase((char)c));
            }
            System.out.println();
            inp.reset(); 
        }
    } 
}
