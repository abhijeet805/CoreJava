import java.util.Scanner;

class Bank {
    float bal;
    int ano;
    String name;

    Bank(){
        bal=50000;
        ano=1234567654;
        name="sai";
    }
    void deposit(float amt)
    {
        bal=bal+amt;
        System.out.println("Deposit succes...");         
    }
    void withdraw(float amt){
        if(bal>500){
            bal=bal-amt;
            System.out.println("Withdraw succs....");
        }
        else{
            System.out.println("Balance are Less");
        }
    }
    void disp()
    {
        System.out.println("Name="+name+"\nAcc no="+ano+"\nBalance"+bal);
    }

    public static void main(String[] args) {
        int ch;
        float amt;
        Bank ob=new Bank();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1-Deposit \n2-Withdraw\n3-Disp Details\nEnter Choice=");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Amount to deposit=");
                    amt=sc.nextInt();
                    ob.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter Amount to withdraw=");
                    amt=sc.nextInt();
                    ob.withdraw(amt);
                  break;

                case 3:
                   System.out.println("Details");
                   ob.disp();
                  break;
            }
        } while (ch<5);
     }
}
