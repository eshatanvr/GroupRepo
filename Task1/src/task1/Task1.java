/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.*;
/**
 *
 * @author PCC
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static int wordCounter(String s)
    {
        int num=0;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                num++;
            }
        }
        return num+1;
    }
    public static int puncCount(String s)
    {
        int num=0;
         for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='!'||s.charAt(i)=='_'||s.charAt(i)==':'||s.charAt(i)==';'||s.charAt(i)=='"'||s.charAt(i)==','||s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='\''||s.charAt(i)=='-')
            {
                num++;
            }
        }
       
        return num;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a phrase:");
        Scanner obj =new Scanner(System.in);

        String  line=obj.nextLine();
        int numberOfWord=wordCounter(line);
        int puncCount=puncCount(line);
        
        System.out.println("number of words are: "+numberOfWord);
        System.out.println("number of punctuations are: "+puncCount);
    }
    
}
