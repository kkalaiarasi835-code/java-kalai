class animal{
    public void makesound(){
        System.out.println("animal sound");
    
    }
}
class dog extends animal{
    public void makesound(){
        System.out.println("dog barks");

    }
}
public class override{
    public static void main(String args[]){
        dog d=new dog();
        d.makesound();
    }
}