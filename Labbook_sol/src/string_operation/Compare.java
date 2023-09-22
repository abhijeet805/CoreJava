package string_operation;

public class Compare {
    public void compare(String s1,String s2)
    {
        int k=s1.compareTo(s2);
        if(k==0)
        {
            System.out.println("String are same");
        }
        else if(k>0)
        {
            System.out.println(s1+"String are Greter");
        }
        else
            System.out.println(s2+"String are greter");

    }
}
