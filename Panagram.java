package cloundVandana;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
       System.out.println("Enter a sentence: "); 
       Scanner sc = new Scanner(System.in);
       String str= sc.nextLine();
       if(isPanagram(str))
       {
        System.out.println("It a panagram");
       } 
       else{
         System.out.println("It a not panagram");
       }
    }
    public static boolean isPanagram(String s)
    {  
        String s1= s.toLowerCase();
        if(s1.length()<26)
        return false;
        for(char ch='a';ch<='z';ch++)
        {
            if(s.indexOf(ch)==-1)
            return false;
        }
        return true;
    }
}
