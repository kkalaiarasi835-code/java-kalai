import java.util.Scanner;
import java.util.Arrays;
public class anagram{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();
     String s2=sc.nextLine();
     if(s1.length()!=s2.length())
     {
         System.out.println("its not anagram");
         return;
     }
     
     char arr1[]=s1.toCharArray();
     char arr2[]=s2.toCharArray();

      Arrays.sort(arr1);
     Arrays.sort(arr2);
     if(Arrays.equals(arr1,arr2))
     {
        System.out.println("its an anagram");
     }
     else
     {
        System.out.println("its not  an anagram");
     }

}
}