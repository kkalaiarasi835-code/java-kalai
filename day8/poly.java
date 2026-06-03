class calculator{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class poly{


public static void main(String args[]){
    calculator calc=new calculator();
    System.out.println(calc.add(11,22));
}
}