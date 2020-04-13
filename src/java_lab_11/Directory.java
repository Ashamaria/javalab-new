/*program 11.3
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_11;

/**
 *
 * @author Akhil
 */
import java.io.*;
public class Directory {
   
    public static void main (String args[]) throws IOException      
    {  
        File f = new File ("c:/java/temp");
        if (f.mkdir()) 
            System.out.println("created a directory"+f);
        else 
            System.out.println ("unable to create a directory"+f);  
    }  
}
