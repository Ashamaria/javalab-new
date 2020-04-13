/*program 11.2 rename file
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
public class RenameFile {
 
  public static void main(String args[])
  {       
        File f = new File("c:\\java","renamefile");  
        File f1 = new File("c:\\java\\Asha_Maria_Saji"); 
        if (f.exists())  
        {    
            System.out.println(f + " does exists.");
            System.out.println("Its size is" + f.length()+ "bytes"); 
            f.renameTo(f1);
            System.out.println("Renamed file name :" + f1 );  
            //System.out.println("deleting the renamed file"+f1);      
            //f.delete(); 
        }  
        else
            System.out.println(f +" does not exists"); 
   }                          
  
}
