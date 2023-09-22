
import string_operation.*;
import java.util.Scanner;

public class SMD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two string");
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        concate ob=new concate();
        Compare ob1=new Compare();

        ob.concate(s1,s2);
        ob1.compare(s1,s2);
    }
}
