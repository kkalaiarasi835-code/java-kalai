class Student{
    String name;
    int age;
    public void display(){
        System.out.println("name:"+name+"age:"+age);
    }
}
    public class obj{
        public static void main(String args[]){
            Student student1=new Student();
            student1.name="test1";
            student1.age=20;
            student1.display();
        }

        
    }
    
