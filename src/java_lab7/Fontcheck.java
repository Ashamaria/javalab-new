/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab7;

/**
 *
 * @author Akhil
 */
import java.awt.*;
public class Fontcheck {
   public static void main (String arg [ ])   
    {   
        Font  p;
        p  = new Font ("TimesNewRoman", Font.BOLD+Font.ITALIC,12);
        String font = p.getName( );  
        int style = p.getStyle ( );
        int size = p.getSize ( );  
        boolean bold = p.isBold ( );  
        boolean normal = p.isPlain ( );
        boolean italic = p.isItalic ( );
        System.out.println ("Font : "+ font + "\n Style  :  "+ style + "\n Size: "+ size + "\n Bold  : "+bold + "\n Italic : "+italic);   
    } 
}
