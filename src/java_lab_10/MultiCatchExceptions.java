/*program for eg of multiple catch statements occuring in a program 10.2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_10;

/**
 *
 * @author Akhil
 */
import java.util.*;
public class MultiCatchExceptions {
      public static void main(String arg[])     
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value of x for division:\t");
        int x=sc.nextInt();
        int arr[]={2,3,4};
        System.out.print("Enter the  array limit :\t");
        int x1= sc.nextInt();
        System.out.print("Enter the  a string :\t");
        String str= sc.next();
        try
        {
            int s=10/x;
            System.out.println("10 / "+x+ " = "+s);
            System.out.println("Array element at "+x+" = "+arr[x]);
            int arr1[] =new int[x1];
            System.out.println(x1+" Character in string "+str +" = "+str.charAt(x1));
            int z=Integer.parseInt(str);
        }
        catch(ArithmeticException ae)
        {
            System.out.println(" generated exception : " + ae);   
        }
        catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.println(" generated exception : " + ai);   
        }
        catch(NegativeArraySizeException ne)
        {
            System.out.println(" generated exception : " + ne);   
        }
        catch(StringIndexOutOfBoundsException ae)
        {
            System.out.println(" generated exception : " + ae);   
        }
        catch(Exception e)
        {
           System.out.println(" generated exception : " + e);        
        }      
        System.out.println(" After the try block"); 
    }
}

