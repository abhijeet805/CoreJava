
import java.util.Scanner;

class patient_report extends Exception
{
    public String toString()
    {
        return "Patient is covid +ve need to Hospitlize";
    }
}

public class patient {
     String name;
     int age,oxy_level,HRCT;
     
     patient(String name,int ox,int hrct)
     {
        this.name=name;
        oxy_level=ox;
        HRCT=hrct;
     }
   
     void check_patient()
     {
        try{
        if(oxy_level<95 && HRCT>10)
          throw new patient_report();
          
         System.out.println("Information="+"\nname="+name+"\toxygen_level="+oxy_level+"\tHRCT="+HRCT);

        }
        catch(Exception e)
        {
            System.out.println("Error="+e);
        }
     }
}
class PDemo
{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);   
      patient ob=new patient("aaa",90,9);
      ob.check_patient();
    }
}
