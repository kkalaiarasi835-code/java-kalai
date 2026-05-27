import java.util.Scanner;
  class pyramid{
    public static void main(String args[])
    {
        Scanner kalai=new Scanner(System.in);
        int n=kalai.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

 }
