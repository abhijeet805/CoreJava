import java.util.InputMismatchException;
import java.util.Scanner;

class zeroexception extends RuntimeException
{
      public String toString()
      {
          return "Number is Zero";
      }
}
public class zero_exeption {
 
 static boolean ispal(int n)
 {
       int num=n,s=0;
    while(n>0)
    {
        int d=n%10;
        s=(s*10)+d;
        n=n/10;
    }
   return (s==num);
 }
    public static void main(String[] args) {
    try{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==0)
       throw new zeroexception();
    
    if(ispal(n)==true)
    {
     System.out.println("Number is Palindrome");
    }
     else{
        System.out.println("Not palindrome");
    }
     
   }catch(InputMismatchException e)
     {
         System.out.println("Number is Invalid");
     } 
     catch(Exception e)
     {
       System.out.println("Zero exception="+e);
     }

}   
}
