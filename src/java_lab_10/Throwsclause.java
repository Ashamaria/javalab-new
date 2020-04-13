/*a program to describe usage of throws clause 10.5
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_10;

/**
 *
 * @author Akhil
 */
public class Throwsclause {
    
    static void throwOne() throws InterruptedException
    {
        System.out.println("Inside throwOne.");
        throw new InterruptedException();
    }
    public static void main(String args[]) 
    {
        try
        {
            throwOne();
        }
        catch(InterruptedException ie)
	{  
            System.out.println(" Generated Exception : " + ie);
        }
    }

}