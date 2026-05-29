public class methodoverload{
    public int addTwonumbers(int a,int b,int c){
        int total=a+b+c;
        return total;

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
    methodoverload a= new methodoverload();
    System.out.println(a.addTwonumbers(11,22,67));
}
}