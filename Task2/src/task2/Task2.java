/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;
import java.util.*;
/**
 *
 * @author PCC
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
   public static String displayVertical(String s)
   {
       String ver=" ";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                
            
            System.out.println(s.charAt(i));
            }
        }
       return ver;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String line=obj.nextLine();
        displayVertical(line);
       
    }
    
}
