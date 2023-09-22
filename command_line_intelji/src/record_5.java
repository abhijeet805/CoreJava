public class record_5 {
    public static void main(String[] args) {
        int n=args.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=Integer.parseInt(args[i]);
        }

        for(int pass=1;pass<n;pass++)
        {
            for(int i=0;i<n-pass;i++)
            {
                if(a[i]>a[i+1])
                {
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
