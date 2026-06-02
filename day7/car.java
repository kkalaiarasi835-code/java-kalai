class carrap{
    String brand;
    int speed;
    public void display(){
        System.out.println("brand:"+brand+"speed:"+speed);
    }
}
public class car{
    public static void main(String args[]){
          carrap car1=new carrap();
          car1.brand="thar";
          car1.speed=500;
          car1.display();
    }
}