package TYBCS;

public class Maximum {
    public void tofind(int a,int b,int c)
    {
       if(a>b &&a>c)
         System.out.println("Greter number="+a);
       else if(b>a && b>c)
         System.out.println("Greter number="+b);
       else if(c>a && c>b)
         System.out.println("Greter number="+c);
       else
       {
        System.out.println("numbers are same");
       }
       
    }
}
