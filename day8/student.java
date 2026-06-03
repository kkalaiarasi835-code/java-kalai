class kalai{
    private String name="kalaiarasi";
    private int age=22;
    private int salary=100000;
    public void setdetails(String name,int age,int salary)
    {   this.name="kalaiarasi";
        this. age=22;
        this.salary=100000;
     }
     public String getname()
     {
        return name;
     }
     public int getage(){
        return age;
     }
     public int getsalary(){
        return salary;
     }
}
public class student{


   public static void main(String args[])
   {
    kalai k=new kalai();
    k.setdetails("kalaiarasi",20,100000);
    System.out.println(k.getname());
    System.out.println(k.getage());
    System.out.println(k.getsalary());



   }
}