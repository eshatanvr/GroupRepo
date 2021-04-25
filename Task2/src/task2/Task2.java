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
   public static String displayVertical()
   {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String line=obj.nextLine();
      
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i)!=' ')
            {
            System.out.println(line.charAt(i));
            }
        }
       return " ";
   }
    public static void main(String[] args) {
        // TODO code application logic here
       
        displayVertical();
       
    }
    
}
