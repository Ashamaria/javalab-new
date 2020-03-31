/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab6;

/**
 *
 * @author Akhil
 */
import java.util.*;
public class MultipleInheritance {
    int s,sub;
}
class Opertions extends MultipleInheritance
{
    public int add(int a, int b)
    {
        s=a+b;
        return(s);
    }
    public int sub(int a, int b)
    {
        sub=a-b;
        return(sub);
    }
    public static void main(String args[])
    {
        Opertions ui = new Opertions();
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values for addition & subtraction ");
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=ui.add(a,b);
        int sub=ui.sub(a,b);
        System.out.println("Sum=" +sum);
        System.out.println("Sub=" +sub);
    } 
}
    

