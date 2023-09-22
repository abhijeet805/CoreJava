package Strpack;

public class compare {
 
    public void compare(String s1,String s2)
    {
        System.out.println("\nAfter Comparing String=");
        int k=s1.compareTo(s2);
        if(k==0)
         System.out.println("String is Equal");
        else if (k>0) {
            System.out.println(s1+"  String is Greter");
        }
        else{
            System.out.println(s2+" String is greter");
        }
    }
}
