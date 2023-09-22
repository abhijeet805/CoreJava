interface operation
{
    void area(float r,float h);
    void volume(float r,float h);
    final float pi=3.142f;
}

class cylinder implements operation
{
     public void area(float r,float h)
     {
        float a=2*pi*r*h+2*pi*r*r;
        System.out.println("Area of Cylinder="+a);
     }

     public void volume(float r,float h)
     {
        float a=pi*r*r*h;
        System.out.println("Volume of Cylinder="+a);
     }

   public static void main(String[] args) {
    cylinder ob=new cylinder();
    ob.area(5.5f, 6.5f);
    ob.volume(7.5f, 2.5f);
   
   }
}
