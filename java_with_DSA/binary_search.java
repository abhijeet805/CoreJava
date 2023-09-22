import java.util.*;

class binary 
{
    static void binary(int a[],int n)
    {
      Scanner sc=new Scanner(System.in);
      int start=0,end=n-1,mid,f=0;
     System.out.println("Enter num to search=");
     int num=sc.nextInt();
      while (start<=end) {
        mid=(start+end)/2;
        if(a[mid]==num)
         {
           System.out.println("Number is found="+a[mid]+"at position="+mid);
           f=1;
           break;
         }
         if(num<a[mid])
         {
          end=mid-1;
         }
         if(num>a[mid])
          {
            start=mid+1;
          }
      }
      if(f==0)
       {
        System.out.println("Number not found");
       }
    }

    public static void main(String[] args) {
      int a[]=new int[10];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array element=");
      for (int i = 0; i < 10; i++) {
         a[i]=sc.nextInt();
      }    
      binary(a,10);
    }
}