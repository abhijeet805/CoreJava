import java.util.Scanner;

class Reverse_single_array
{
    void Reverse_array()
    {
        int digit,i,j,n=6;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[15];

        System.out.println("Enter Array Element=");
        for (int k = 0; k < n; k++) {
            a[k]=sc.nextInt();
        }

        for(i=1;i<n;i++)
         {  
            digit=a[i];  //start with second number
            for(j=i-1;j>=0;j--)
            {
              a[j+1]=a[j];     //change element position by +1;for inserting a[i]th element
            }
             a[0]=digit;   //All Element insert in first index;

         }
         System.out.println("Reverse Array=");
         for (int k = 0; k < n; k++) {
           System.out.print("\t"+a[k]);
        }
    }

    public static void main(String[] args) {
     
        Reverse_single_array ob=new Reverse_single_array();
        ob.Reverse_array();
    }
}