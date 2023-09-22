package Mathematics;

public class power {
    public void find_power(int x,int y)
    {
       int m=1,y1=y;
        while(y>0)
        {
            m=m*x;
            y--;
        }
        System.out.println("Power of "+x+"**"+y1+"="+m);
    }
}
