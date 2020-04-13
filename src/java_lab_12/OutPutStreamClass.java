/*12.1 program to create a file and write data into it using methods Outputstramclass
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_12;

/**
 *
 * @author Akhil
 */
import java.io.*;
public class OutPutStreamClass {
   public static void main(String args[])
    {
        try
        {    
             FileOutputStream f=new FileOutputStream("C:Java\\Write.txt");    
             String s="Welcome";    
             byte b[]=s.getBytes(); 
             f.write(b);    
             f.close();    
             System.out.println("File Created And Write Successfully");    
        }
        catch(Exception e)
            {
                System.out.println(e);
            }    
            
    }
  
}
