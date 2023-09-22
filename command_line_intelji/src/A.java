public class A {
    A()
    {
        System.out.println("I am A");
    }
    A(int a,int b)
    {
        System.out.println("Addition="+(a+b));
    }

    public static void main(String[] args) {
        A ob=new A(10,20);
        A ob1=new A();

    }
}
