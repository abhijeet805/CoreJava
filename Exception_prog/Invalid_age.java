import java.util.Scanner;

class Invalid_age extends Exception 
{
    public String toString()
    {
        return "Invalid Age";
    }       
}

class age{
    public static void main(String[] args) {
        try {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter age");
    int age=sc.nextInt();
        
    if(age<=0)
       throw new Invalid_age();
    
       if( age>=18)
       {
         System.out.println("Voter");
       }
       else{
        System.out.println("Not voter");
       }

} catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error="+e);
        }
    }
}
