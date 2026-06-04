abstract class vehicle{
    abstract void start();
    public void stop(){
        System.out.println("Stopped");
    }
}

class car extends vehicle{
    void start(){
        System.out.println("car started");

    }
}
public class ab{
    public static void main(String args[])
    {
        car c=new car();
        c.start();
    }
}
    
