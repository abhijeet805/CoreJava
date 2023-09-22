

import java.util.Scanner;

class numissmall extends Exception{
    public String toString()
    {
        return "Number is small";
    }
}

class numisgreter extends Exception{
    public String toString()
    {
        return "Number is Greter";
    }
}

public class patient_exceceptio{
    public static void main(String[] args) {

        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            int num=sc.nextInt();

            if(num<5)
            {
                throw new numissmall();
            }
            if(num>=10)
                throw new numisgreter();

            int f=1;
            for (int i = num; i >=1; i--) {
                f=f*i;
            }
            System.out.println("Factorial="+f);

        }

        catch(numissmall e)
        {
            System.out.println("Error1="+e);
        }
        catch(numisgreter e1)
        {
            System.out.println("Error2="+e1);
        }
    }
}





