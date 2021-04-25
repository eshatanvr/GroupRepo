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
Scanner sc =new Scanner (System .in);
    System.out.println("Enter a new String");
    String s1=sc.nextLine();
    int i;
    int l=s1.length();
    char ch;
    int c=0;
    String s=s1.toLowerCase();
    for(i=0;i<l;i++)
    {
      ch=s.charAt(i);
      if(ch=='a'|| ch=='e' || ch== 'i' || ch== 'o' || ch== 'u')
      c++;
  }
// Total numbers of Vowel
    System.out.print("total numbers of vowels : " +c);
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
     public static boolean isSubsequence (String str1, String str2)
  {
    if(str1.length()== 0)
      return true;
    int i=0;
    int j=0;
    while(i<str1.length()&&j<str2.length()){
      if(str1.charAt(i)==str2.charAt(j))
      {
        i++;
      }
      if (str1.length()==i)
      {
// Returns true is 1 in SubString
        return true;
      }
      j++;
    }
// Returns false is 0 in SubString
    return false;
  }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a phrase:");
        Scanner obj =new Scanner(System.in);

        String  line=obj.nextLine();
        int numberOfWord=wordCounter(line);
        int puncCount=puncCount(line);
        int i;
        int l=line.length();
        char ch;
        int c=0;
        String s=line.toLowerCase();
        for(i=0;i<l;i++)
        {
          ch=s.charAt(i);
          if(ch=='a'|| ch=='e' || ch== 'i' || ch== 'o' || ch== 'u')
          c++;
        }
        
        System.out.println("Enter a sub String to find:");
        String subStr=obj.nextLine();
         boolean result= isSubsequence(line,subStr);
         System.out.println(result);
        System.out.println("number of words are: "+numberOfWord);
        System.out.println("number of punctuations are: "+puncCount);
        System.out.print("total numbers of vowels : " +c);
// Function to check the SubString
  public static boolean isSubsequence (String str1, String str2)
  {
    if(str1.length()== 0)
      return true;
    int i=0;
    int j=0;
    while(i<str1.length()&&j<str2.length()){
      if(str1.charAt(i)==str2.charAt(j))
      {
        i++;
      }
      if (str1.length()==i)
      {
// Returns true is 1 in SubString
        return true;
      }
      j++;
    }
// Returns false is 0 in SubString
    return false;
  }
// Driver code
  public static void main(String[]args){
    boolean result= isSubsequence("ade","abcdefg");
    System.out.println(result);
    }
    
}
    
    
 