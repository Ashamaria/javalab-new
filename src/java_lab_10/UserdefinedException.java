/*program for creation of user defined exception 10.6
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_10;

/**
 *
 * @author Akhil
 */
import java.util.Scanner;
public class UserdefinedException {
   
    public static void main(String arg[])     
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value of y :\t");
        int y=sc.nextInt();
        try
        {
             if(y%3!=0)
             {
                 throw new MyException();
                 
             }
        }
        catch(MyException me)
        {
            System.out.println(me); 
        }
    }
 
}
