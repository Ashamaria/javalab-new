/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab9;

/**
 *
 * @author Akhil
 */
public class Override {
    void value()
    {
        System.out.println("Null");
    }
   void value(int x,int y)
   {
      System.out.println("Value of x and  y = " + x+" "+y); 
   }
   void value1(double a)
   {
       System.out.println("value of a = " +a);
   }
   public static void main(String args[])
   {
       Override O = new Override();
       O.value();
       O.value(15,10);
       O.value1(3.5);
   }
   
   }

