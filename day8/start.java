class vehicle{
    public void start(){
        System.out.println("vehicle is starting");
    }

}
class car extends vehicle{
    public void start(){
        System.out.println("car is loading");
    }
}
class bus extends vehicle{
    public void start(){
        System.out.println("bus is loading");
    }
}
class bike extends vehicle{
    public void start()
    {
        System.out.println("bike is loading");
    }
}
public class start{
    public static void main(String args[])
    {
        bus b=new bus();
        b.start();
        bike b1=new bike();
        b1.start();
        car c1=new car();
         c1.start();
    }
}