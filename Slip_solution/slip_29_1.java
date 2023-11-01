import java.util.Scanner;

class customer{
    int cno;
    String cname,add,contact;
    customer(int cno,String cname,String add,String contact)
    {
        this.cno=cno;
        this.add=add;
        this.contact=contact;
        this.cname=cname;
    }
  
    static void search(customer ob[],int n,String conct)
    {
        for(int i=0;i<n;i++){
          if(ob[i].contact.equals(conct))
          {
           System.out.println("cust no="+ob[i].cno+"\nCname="+ob[i].cname+"\ncAdd="+ob[i].add+"\nContact="+ob[i].contact);
           break;  
          }  
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of customer=");
        int n=sc.nextInt();
        customer ob[]=new customer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter cno,cname,add,contact");
            int cno=sc.nextInt();
            String cname=sc.next();
            String add=sc.next();
            String contact=sc.next();
            ob[i]=new customer(cno,cname,add,contact);
        }
        System.out.println("Enter contact to search name");
        String conct=sc.next();
        search(ob,n,conct);
    }
}
