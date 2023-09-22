import java.util.*;
public class name {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String s=sc.nextLine();

        String s1[]=s.split(" ");
        StringBuffer sbr=new StringBuffer(s1[1]);

        char ch=Character.toUpperCase(sbr.charAt(0));

        sbr.setCharAt(0,ch);
        System.out.println("Name="+s1[2]+" "+s1[0]+" "+sbr);


        System.out.println("Alternate charcter=");
        for (int i = 0; i < s1[0].length(); i=i+2) {

            System.out.print(s1[0].charAt(i));
        }
    }
}
