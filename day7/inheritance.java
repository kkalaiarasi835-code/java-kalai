class user{
    String name;
    String phone;
    String location;
    user(String name,String phone,String location){
        this.name=name;
        this.phone=phone;
        this.location=location;
    }
    public void basicInfo(){
        System.out.println(name+" "+phone+" "+location);
    }
}
class Fooduser extends user{
    String favfood;
    Fooduser(String name,String phone,String location,String favfood){
        super(name,phone,location);
        this.name=name;
        this.phone=phone;
        this.location=location;
        this.favfood=favfood;
        
    }
    public void userDetails(){
        System.out.println("favourite food:"+ favfood +"name:"+ name +"phone:"+ phone +"location" + location);
    }
}
public class inheritance{
    public static void main(String[]args){
        Fooduser user1=new Fooduser("foodie","9894617430","chennai","biriyani");
        user1.userDetails();
    }
}

        

    
