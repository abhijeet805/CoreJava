import java.io.*;
import java.util.Scanner;
class stud 
{
       int rno;
       String name,sclass;
       void accept() throws Exception
       {
        Scanner sc=new Scanner(System.in);
           InputStreamReader ir=new InputStreamReader(System.in);
           BufferedReader b1=new BufferedReader(ir);
           System.out.println("Enter rno,name,class");
           rno=sc.nextInt();
           name=sc.next();
           sclass=sc.next();
       }
       void disp()
       {
         System.out.println("Name="+name+"\nrno="+rno+"\nclass"+sclass);
       }
       public static void main(String[] args)throws Exception
        {
           stud ob=new stud();
           ob.accept();
           ob.disp();
        }
}
