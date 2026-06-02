class Student{
    String name;
    int age;
    Student()
    {
        name="default";
        age=20;
    }
    Student(String n,int a)

    {
        name=n;
        age=a;

    }


    public void display(){
        System.out.println("name:"+name+"age:"+age);
    }
}
    public class constructor{
        public static void main(String args[]){
            Student student1=new Student();
            
            student1.display();
        }

        
    }