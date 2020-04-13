/*user defined exception
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_10;

/**
 *
 * @author Akhil
 */
public class MyException  extends Exception
{
    @Override
    public String toString()
    {
        return "The number is not divisible by 3 ...";
    }
}

