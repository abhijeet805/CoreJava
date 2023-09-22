public class student_mark {
    
    static void clculate_per(int a[])
    {
        int sum=0,i;
        for (i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        float p=sum/(a.length-2);
        System.out.println(+sum);
        System.out.println("percentage="+p);
    }
                             
    public static void main(String[] args) //101 om 23 43 55 66 88 
    {
     System.out.println("Roll no="+args[0]);
     System.out.println("Name="+args[1]);
     
     int a[]=new int[args.length];
     for (int i = 0; i < args.length-2; i++) {
        a[i]=Integer.parseInt(args[i+2]);
     }
     clculate_per(a);
    }
}
