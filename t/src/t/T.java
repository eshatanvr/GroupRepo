/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t;

import java.util.*;
/**
 *
 * @author PCC
 */
public class t {
    /**
     * @param args the command line arguments
     */
    public static String stringEncryption(String s)
    {
        String x=s.toLowerCase();
        try{
        for(int i=0;i<s.length();i++)
        {
           int a=x.charAt(i);
            a=a-10;
          char y=(char)a;
          x= x.replace(x.charAt(i), y);
        }
        
        }
        catch(Exception ex)
        {
            System.out.println("sorryy");
        }
        return x;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a phrase:");
        Scanner obj =new Scanner(System.in);
        String  line=obj.nextLine();
        String encLine=stringEncryption(line);
        System.out.println(encLine);
         String str = "The quick brown fox jump";
        //s represents single space.
        // all blank spaces replace with empty.
        // By using unique code of the space we remove all wide spaces in the string.
            String str1=str.replaceAll("\\s" ,"");
            System.out.println(str1);
        // to get numbers from the given string.
            String sInput = " He is78 a go23od Prog97ram08er!";
            //replaceAllString from integers used arg0, arg1.
            // By using this ^ only integers part is separated from string.
            System.out.println("The number part is :" + sInput.replaceAll("[^0-9]", ""));
            System.out.println("The string part is :" + sInput.replaceAll("[0-9]", ""));
    }
    
}
