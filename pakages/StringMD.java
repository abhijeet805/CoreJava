import java.util.*;

import Strpack.compare;
import Strpack.concat;

public class StringMD {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String1=");
    String s1=sc.next();
    System.out.println("Enter String2=");
    String s2=sc.next();
    
    concat ob=new concat();
    compare ob1=new compare();

    ob.concat(s1,s2);
    ob1.compare(s1,s2);

}
}
