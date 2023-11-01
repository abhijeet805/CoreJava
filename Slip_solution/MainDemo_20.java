import Operation_slip20.*;
class MD{
    public static void main(String[] args) {
        float a=12.66f;
        float b=33.22f;
        Addition ob=new Addition();
        ob.add(a, b);
        ob.sub(a, b);
        Maximum ob1=new Maximum();
        ob1.max(a, b);
    }
}