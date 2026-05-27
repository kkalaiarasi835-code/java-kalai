
import java.util.Scanner;
class counting{
    public static void main(String args[])
    {
        Scanner kalai=new Scanner(System.in);
        int n=kalai.nextInt();
        int sum=0;
        while(n>0){
            int remainder= n%10;
            sum+=remainder;
            n/=10;
        }
        System.out.println(sum);
        }
    }
    
