import java.util.Scanner;

class InvlidDataExc extends RuntimeException{
    public String toString()
    {
        return "Invalid Pan and mobile num";
    }
}

class check
{
    public static void main(String[] args) {
        try {
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter PAN no=");
            String pan=sc.nextLine();
            System.out.println("Enter mobaile no=");
            Long mno=sc.nextLong();
            
            String s1=""+mno;
            if(s1.length()!=10)
              throw new InvlidDataExc();

            System.out.println("Mobaile no="+mno);
            
            if(pan.length()!=10)
              throw new InvlidDataExc();

            for(int i=0;i<=4;i++)
             {
                if(!Character.isUpperCase(pan.charAt(i)))
                 throw new InvlidDataExc();
             }

             for(int i=5;i<=8;i++)
              {
                 if(!Character.isDigit(pan.charAt(i)))
                  throw new InvlidDataExc();
              }

              if(!Character.isUpperCase(pan.charAt(9)))
                throw new InvlidDataExc();
  
              System.out.println("PAN Card="+pan);
             
        } catch (Exception e) {
            System.out.println("Error="+e);
            // TODO: handle exception
        }
    }
}