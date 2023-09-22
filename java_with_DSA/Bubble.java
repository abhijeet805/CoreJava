public class Bubble
{
    static void Bubble(int a[],int n)
    {
         int pass,i,num;
         for(pass=1;pass<n;pass++)
         {
            for(i=0;i<n-pass;i++)
            {
                if(a[i]>a[i+1])
                {
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }   
         }


         for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
         }
    }
    public static void main(String[] args) {
        int a[]=new int[]{25,88,99,777777,44,11,33,20};
        Bubble(a,8);
    }
}