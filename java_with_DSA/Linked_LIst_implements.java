class linked
{
   Node head=null,temp;//By default head initialliza by null so no require to .....
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

    void addFirst(int data)
    {  
       Node newnode=new Node(data);
       if(head==null)
       {
         temp=head=newnode; //jar aapan first nanter last operation perform kel tar temp ha last rahu mhanun temp ha head la dila
         return;            //sagle first operation performed kele tar e.g  1=>2=>3=>4 atta temp ha 4 la ahe
       }
       
       newnode.next=head;
       head=newnode;
    }

    void addLast(int data)
    {   
         
        
         Node newnode=new Node(data);
         if(head==null)
         {
            temp=head=newnode;//jar starting la addLast() operation kela tar temp ha new node la connect karayla help karren.
            return;
         }
         temp.next=newnode;//first nantar last operation performed kel tar temp ha last la rahin.
         temp=newnode;
    }

   void display()
   {
     Node current=head;
      while(current!=null)
      {
        System.out.print(current.data+" => ");
        current=current.next;
      }
      System.out.println("null");
   } 

   public static void main(String[] args) {
     linked list=new linked();
     list.addLast(100);
     list.addLast(150);
     list.addFirst(5);
     list.addFirst(4);
     list.addFirst(3);
     list.addFirst(10);
     list.addLast(13);
     list.addLast(20);;
     list.addFirst(55);
     list.addLast(22);
     list.display();
   }
}