import java.util.*;
class list
{
   Scanner sc=new Scanner(System.in);    

   Node head,temp,temp1;
   class Node
  {
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
  }

  void create()
  {

    System.out.println("Enter Limit to insert node=");
    int n=sc.nextInt();
      System.out.println("Enter n node");

      for (int i = 0; i < n; i++) {
        int data=sc.nextInt();

         Node newnode=new Node(data);
         
            if(head==null)
            {
               temp=head=newnode; 
            }
            else{
                temp.next=newnode;
                temp=newnode;
            }
        
        }   
    }

    void display()
    {
        temp1=head;

        while(temp1!=null)
        {
            System.out.print(temp1.data+" => ");
            temp1=temp1.next;
        }
        System.out.println("NULL");
    }

    void insert_big()
    {
        System.out.println("Enter data=");
        int data=sc.nextInt();
        Node newnode=new Node(data);

        if(head==null)
         {
            head=newnode;
            return;
         }
         newnode.next=head;
         head=newnode;
    }

    void insert_end()
    {
      System.out.println("Enter data=");
      int data=sc.nextInt();
      Node newnode=new Node(data);

      if(head==null)
       {
        head=newnode;
        return;
       }

       temp1=head;
       while(temp1.next!=null)
       {
         temp1=temp1.next;
       }
       temp1.next=newnode;
    }

 void delete_beg()
 {
   if(head.next==null)
   {
    head=null;
    return;
   }

    Node t=head;
    head=head.next;
    t=null;

 }

 void delete_end()
 {

   if(head.next==null)
   {
    head=null;
    return;
   }

   Node secondlast=head;
   Node lastnode=head.next;
  while(lastnode.next!=null)
  {
    lastnode=lastnode.next;
    secondlast=secondlast.next;
  }
 secondlast.next=null;
}

    public static void main(String[] args) {
        
   Scanner sc=new Scanner(System.in);

        list ob=new list();
        
        int ch;
   
        do {

            System.out.println("1=create \n2-display \n3-insert beg \n4-insert_end\n5-delete beg\n6-delete end\n");
            System.out.println("Enter Choice=");
            ch=sc.nextInt();
        switch (ch) {
            case 1:
                  ob.create();  
                break;
            case 2:
                ob.display();
                break;
            case 3:
              ob.insert_big();
             break;
            case 4:
            ob.insert_end();
            break;
            case 5:
            ob.delete_beg();
            break;
            case 6:
            ob.delete_end();
            break;

            default: System.out.println("Invalid choice");
                break;
        }
        } while (ch<7);
    }
}