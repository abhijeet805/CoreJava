class selection
 {
    static void selection(int a[],int n)
    {
        int pass,i,index,min;

        for(pass=1;pass<n;pass++)
          {
             min=a[pass-1];
             index=pass-1;
             for(i=pass;i<n;i++)
             {
                if(a[i]<min)
                {
                    min=a[i];
                    index=i;
                }
             }
             int t=a[pass-1];
             a[pass-1]=a[index];
             a[index]=t;
          }
          for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
          }
    }
    public static void main(String[] args) {
        
        int a[]=new int[]{25,45,66,10,11,32};
        selection(a,6);
    }
 }