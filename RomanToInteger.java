import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.next();

        int result = romanToInt(romanNumeral);
        System.out.println("The integer representation of " + romanNumeral + " is: " + result);
    }


public int romanToInt(String s) {
        Map<Character, Integer> hm= new HashMap<Character, Integer>();
        int sum=0;
        hm.put('I',1);
         hm.put('V',5);
          hm.put('X',10);
           hm.put('L',50);
            hm.put('C',100);
             hm.put('D',500);
              hm.put('M',1000);
              s=s.replace("IV","IIII");
              s=s.replace("IX","IIIIV");
              s=s.replace("XL","XXXX");
              s=s.replace("XC","XXXXL");
              s=s.replace("CD","CCCC");
              s=s.replace("CM","CCCCD");
              for(int i=0;i<s.length();i++)
              {
                  sum=sum+hm.get(s.charAt(i));
              }
            return sum;
    }
}