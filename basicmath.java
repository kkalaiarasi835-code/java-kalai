import java.util.*;
class basicmath{
    public static void main(String args[])
    {
        Scanner kalai=new Scanner(System.in);
        int a=kalai.nextInt();
        int b=kalai.nextInt();
        int c=kalai.nextInt();
        int d=a*b*c;
        System.out.println("d:"+ d);
        int e=a+b+c;
        System.out.println("e:"+ e);
        int last=d/e;
        System.out.println("last operations:"+ last);


    }
}