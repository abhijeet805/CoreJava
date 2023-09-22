import java.util.*;

class linked_list
{
    public static void main(String[] args) {
        
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(20);
        l1.add(55);
        l1.add(78);
        l1.add(22);
        l1.addFirst(123456);
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        l1.set(3,200);
         System.out.println(l1);
          l1.remove(3);
           System.out.println(l1);
    }
}