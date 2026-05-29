public class vvoid{
    public int addTwonumbers(int a,int b){
        int c=a+b;
        return c;
    }
    static void change(int x){
        x=500;
        System.out.println("Inside method:"+x);
    
    }

public static void main(String [] args)
{
    int y=5;

    change(y);
    System.out.println("outside method:"+y);
    vvoid a= new vvoid();
    System.out.println(a.addTwonumbers(11,22));
}
}