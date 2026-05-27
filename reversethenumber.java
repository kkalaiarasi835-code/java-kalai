import java.util.Scanner;
class reversethe{
    public static void main(String args[])
    {
        Scanner kalai=new Scanner(System.in);
        int n=kalai.nextInt();
        int reverse=0;
        while(n>0){
            int digit=n%10;
             reverse=reverse*10+digit;
            n/=10;

        }
        System.out.println(reverse);
        }
    }
    
