class insertion
{
    static void insertion(int a[],int n)
    {
         int pass,i,num;
         for(pass=1;pass<n;pass++)
         {
            num=a[pass];
            i=pass-1;
            while(i>=0)
            {
                if(num<a[i])
                 {
                     a[i+1]=a[i]; 
                 }
                else 
                {
                   break;
                }
                
                   i--;      
            }
            a[i+1]=num;

         }
         for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
         }
    }
    public static void main(String[] args) {
        int a[]=new int[]{25,88,99,77,44,11,33,20};
        insertion(a,8);
    }
}