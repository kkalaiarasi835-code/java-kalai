import java.util.Scanner;
public class sumarray{
    public static void main(String args[])
    {
        Scanner kalai=new Scanner(System.in);
        int n=kalai.nextInt();
       
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
            arr[i][j]=kalai.nextInt();
             }
        }
        System.out.println("Matrix:");
    
        for(int i=0;i<n;i++)
          {
        
            System.out.println(arr[i][i]+" ");
          }
    }
 }
   
    
