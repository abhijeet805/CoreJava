import java.util.*;
class item
{
     int ino;
     String iname;
     float price;
     static int cnt=0;
     item(){
        ino=1;
        iname="pen";
        price=12.5f;
     }
     item(int ino,String iname,float price)
     { cnt++;
        System.out.println("Object Count="+cnt);
       this.ino=ino;
       this.iname=iname;
       this.price=price;
     }

   void disp()
   {
     System.out.println("Item no="+ino+"\nItem name="+iname+"\nItem price="+price);
   }
 
   public static void main(String[] args) {
    item ob=new item(101,"pencil",20f);
    ob.disp();
    item ob1=new item(102,"ball",200f);
    ob1.disp();
    item ob2=new item(103,"bag",300f);
    ob2.disp();
    item ob3=new item(104,"laptop",50000f);
    ob3.disp();
    item ob4=new item(105,"Earbuds",2000f);
    ob4.disp();
   }
}
