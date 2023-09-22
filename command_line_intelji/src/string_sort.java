public class string_sort {
    public static void main(String[] args) {

        int n=args.length;
        for (int pass = 1; pass < n; pass++) {
            for (int i = 0; i < n-pass; i++) {
                //int k=args[i].compareTo(args[i+1]);
                if((args[i].compareTo(args[i+1]))>0)//if(k>0)
                {
                    String t=args[i];
                    args[i]=args[i+1];
                    args[i+1]=t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(args[i]);
        }
    }
}
