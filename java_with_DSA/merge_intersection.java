import java.util.*;
class linked_list
{
    class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val)
        {
          this.val=val;
          this.next=null;   
        }
    } 

      Scanner sc=new Scanner(System.in);
    ListNode create(ListNode head)
    {
      ListNode temp=null;
      System.out.println("Enter limit= ");
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
          
        System.out.println("Enter number ");
        int num=sc.nextInt();
        ListNode newnode=new ListNode(num);
 
        if(head==null)
        {
          head=temp=newnode;
        }
       else{
        temp.next=newnode;
        temp=newnode;
       }

      }
      return head;
    }

    void display(ListNode head)
    {
      ListNode temp=head;
      while(temp!=null)
      {
        System.out.print(temp.val+"=>");
        temp=temp.next;
      }
      System.out.println("NULL\n");
    }
 ListNode merge_sorted(ListNode head1,ListNode head2)
 {
  ListNode temp1=head1,temp2=head2;
  ListNode connect,head3=null;

  while (temp1!=null && temp2!=null)
   {
    if(temp1.val <= temp2.val)
    {
      if(head3==null)
      {
        head3=connect=temp1;
        temp1=temp1.next;
      }
      else{
          connect.next=temp1;
          connect=temp1;
          temp1=temp1.next;
      }
    }
  else{
    
      if(head3==null)
      {
        temp2=connect=head3;
        temp2=temp2.next;
      }
      else{
          connect.next=temp2;
          connect=temp2;
          temp2=temp2.next;
      }
    }
  
  }
  return head3;

 }
  public static void main(String[] args) {
      linked_list ob=new linked_list();
      //linked_list ob1=new linked_list();
      
      int ch;
      ListNode head1=null,head2=null,head3;
      Scanner sc=new Scanner(System.in);
       do {

            System.out.println("1=create two list \n2-display\n 3-merge list");
            System.out.println("Enter Choice=");
            ch=sc.nextInt();
        switch (ch) {
            case 1:
                  head1=ob.create(head1);
                  head2=ob.create(head2);  
                break;
            case 2:
                    ob.display(head1);
                    ob.display(head2);
                    break;
            case 3:
                 head3=ob.merge_sorted(head1,head2);
                 ob.display(head3);

        }
      }while(ch<4);
    }
    
}