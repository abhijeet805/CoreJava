import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Donor  
{
     String name,add,contact,bloodG,date_last_donation;
     int age;
    Donor(String name,int age,String contact,String bloodG,String date_last_donation, String add)
    {
      this.name=name;
      this.contact=contact;
      this.bloodG=bloodG;
      this.date_last_donation=date_last_donation;
      this.age=age;
      this.add=add;
    }


}

class demo{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit of object");
        int n=sc.nextInt();
      Donor ob[]=new Donor[n];

      for (int i = 0; i < n; i++) {
         System.out.println("Enter name,age,contact,blood Group,date,add");
         String name=sc.next();
         int age=sc.nextInt();
         String contact=sc.next();
         String blood=sc.next();
         String date=sc.next();
         String add=sc.next();
        ob[i]=new Donor(name,age, contact, blood, date,add);
        }

    FileWriter f1=new FileWriter("Donor.txt");
    BufferedWriter b1=new BufferedWriter(f1);
    for (int i = 0; i < n; i++) {
        b1.write(ob[i].name+"\t");
        b1.write(ob[i].age+"\t");
        b1.write(ob[i].add+"\t");
        b1.write(ob[i].contact+"\t");
        b1.write(ob[i].bloodG+"\t");
        b1.write(ob[i].date_last_donation+"\t");
        b1.write("\n");
    }
    b1.close();
    FileReader f2=new FileReader("Donor.txt");
    BufferedReader b2=new BufferedReader(f2);
    String s1="";
    while((s1=b2.readLine())!=null)
    {
        String s2[]=s1.split("\t");
        
        if(s2[2].equals("pune") && s2[4].equals("A+"))
           System.out.println(s1);
    }    
}
}
