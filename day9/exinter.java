interface payment{
    void makepayment();
}
class phonepe implements payment{
    public void makepayment(){
        System.out.println("payment is done using phonepe");
    }

}
class googlepay implements payment{
    public void makepayment(){
        System.out.println("payment is done using googlepay");

    }
}
class paytm implements payment{
    public void makepayment(){
        System.out.println("payment is done using paytm");
    }
}

public class exinter{
    public static void main(String args[]){
        phonepe c=new phonepe();
        c.makepayment();
        googlepay c1=new googlepay();
        c1.makepayment();
        paytm c2=new paytm();
        c2.makepayment();
    }
}