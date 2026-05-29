import java.util.Scanner;
public class TwoArray{
    public static void main(String args[])
    {
        Scanner kalai=new Scanner(System.in);
        int n=kalai.nextInt();
        int m=kalai.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
            arr[i][j]=kalai.nextInt();
           }
        }
        System.out.println("Matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            }
        }

    }
