import java.util.Scanner;
    abstract class order1{
        int id;
        String disc;
        Scanner sc=new Scanner(System.in);
        void accept() {
            System.out.println("Enter id and discription=");
            id = sc.nextInt();
            disc = sc.next();
        }
    }
   class purchace_order extends order1{
        String cname;
        void acceptp()
        {
            super.accept();
            System.out.println("Enter customer name= ");
            cname=sc.next();
        }
        void display()
        {
            System.out.println("Name="+cname+"id"+id+"disc"+disc);
        }
   }

class sales_order extends order1{
    String vname;
    void accepts()
    {
        super.accept();
        System.out.println("Enter vendor name= ");
        vname=sc.next();
    }
    void display()
    {
        System.out.println("\tName="+vname+"\tid"+id+"\tdisc"+disc);
    }
}
    public class order_Demo{
        public static void main(String[] args) {
         purchace_order p[]=new purchace_order[3];
         sales_order s[]=new sales_order[3];

         for (int i = 0; i < p.length; i++) {
              p[i]=new purchace_order();
              p[i].acceptp();
            }
            for (int i = 0; i < p.length; i++) {
                s[i]=new sales_order();
                s[i].accepts();
            }


            for (int i = 0; i < p.length; i++) {
              p[i].display();
            }

            for (int i = 0; i < p.length; i++) {
                s[i].display();
            }
        }
    }
