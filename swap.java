import java.util.Scanner;
class swap{
    public static void main(String args[])
     {
    Scanner scan= new Scanner(System.in);
    System.out.println("Before swapping");
    System.out.println("Enter a number1:");
    int a =scan.nextInt();
    System.out.println("Enter a number2:");
    int b =scan.nextInt();
     a=a+b;
     b=a-b;
     a=a-b;
    System.out.println("after swapping");
    System.out.println("a:" + a);
    System.out.println("b:" + b);
}
}