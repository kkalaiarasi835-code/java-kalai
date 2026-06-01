public class string{
    public static void main (String args[])
    {
        String s1="hello";
        s1=s1.concat("world");
        //System.out.println(s1);
        StringBuilder sb=new StringBuilder
        ("java");
        sb.append(" programming");
        System.out.println(sb.charAt(6));
        System.out.println(sb.reverse());
        int c='8';
        System.out.println(c);



    }
}