import java.util.Scanner;
class string{
    public static void main(String args[])
    {
        Scanner kalai=new Scanner(System.in);
        System.out.println("Enter  your :");
        String input=kalai.nextLine();
        if(input.equals("red"))
        {
            System.out.println("Stop");
        }
        else if(input.equals("green"))
        {
            System.out.println("go");
        }
        else{
            System.out.println("not exists");
        }

    }
}