abstract class Bank
{
    abstract void getBalance(int depo);
}
class BankA extends Bank
{
    void getBalance(int depo)
    {
        System.out.println("Deposite cash="+depo);
    }
}

class BankB extends Bank
{
    void getBalance(int depo)
    {
        System.out.println("Deposite cash="+depo);
    }
}
class BankC extends Bank
{
    void getBalance(int depo)
    {
        System.out.println("Deposite cash="+depo);
    }
}

public class slip_24_1 {
    public static void main(String[] args) {
        BankA A=new BankA();
        BankB B=new BankB();
        BankC C=new BankC();
        A.getBalance(100);
        B.getBalance(150);
        C.getBalance(200);

    }
}
