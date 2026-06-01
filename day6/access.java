public class access{
    public static void main (String args[])
    {
        String a="hello";
        String b=new String("hello");
        for(int i=0;i<a.length();i++)
        {

            System.out.print(a.charAt(i));
        }
        for(char c:a.toCharArray())
        {

            System.out.print(c+" ");
        }
    }
}