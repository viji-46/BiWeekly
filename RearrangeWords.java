import java.util.Arrays;
import java.util.Scanner;

public class RearrangeWords
{
    public static String rearrangeWords(String s) 
    {
        String [] str = s.split(" ");
        Arrays.sort(str, (a,b)-> a.length()-b.length());
        String ans= str[0];
        for(int i=1; i<str.length;i++)
        {
         ans += " " + str[i];
        }
     return Character.toUpperCase(ans.charAt(0))+(ans.substring(1)).toLowerCase();
    }
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the string:");
       String s= sc.nextLine();
       System.out.println(rearrangeWords(s));
    }
}