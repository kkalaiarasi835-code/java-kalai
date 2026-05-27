import java.util.Scanner;
class fizzbuzz{
    public static void main(String args[])
    { Scanner kalai=new Scanner(System.in);
    System.out.println("Enter your limit:");
    int a=kalai.nextInt();
       for(int i=1;i<=a;i++)

        if(i%3==0 && i%5==0)
        {
            System.out.println("fizzbuzz");
        }
        else if(i%3==0)
        {
            System.out.println("fizz");

        } 
         else if(i%5==0){
            System.out.println("Buzz");
        } 
        else{
            System.out.println("given numbers is not divisible");
        }  }
    
}