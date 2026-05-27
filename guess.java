import java.util.Scanner;
class guess{
    public  static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int secret=45;
        int guess;
        do{
           guess=scan.nextInt();
           if(guess<secret)
           {
            System.out.println("your guess is smaller");
    
           }
           else if(guess>secret){
            System.out.println("your guess is higher");
           }
        }while(guess!= secret);
    
           System.out.println("your guess is correct");
        }

        }


