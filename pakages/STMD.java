import java.util.Scanner;

import TYBCS1.*;
public class STMD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Limit=");
        int n= sc.nextInt();
     
        student s1[]=new student[n];
        Teacher t1[]=new Teacher[n]; 
        System.out.println("Enter Student info:");
        
        for (int i = 0; i < s1.length; i++) {
            System.out.println("Enter rno,name,per");
            int rno=sc.nextInt();
            String name=sc.next();
            float per=sc.nextFloat();
            s1[i]=new student(rno, name, per);
        }
        
        System.out.println("Enter Teacher info:");
        for (int i = 0; i < t1.length; i++) {
            System.out.println("Enter id,name,subject");
            int id=sc.nextInt();
            String name=sc.next();
            String sub=sc.next();
            t1[i]=new Teacher(id, name, sub);
        }

         System.out.println("Student info:");
         System.out.println("Rno\tname\tpercentage");
        for (int i = 0; i < s1.length; i++) {
            s1[i].disp();
        }

         System.out.println("Teacher info where subject is java:");
         System.out.println("ID\tname\tSubject");
         for (int i = 0; i < t1.length; i++) 
      {
        if(t1[i].sub.equalsIgnoreCase("java")) // variable sub is also public in teacher class 
        {
           t1[i].disp();
        }
      }
    }
}
