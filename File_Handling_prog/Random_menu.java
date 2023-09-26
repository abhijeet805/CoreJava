import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

class random_num
{
    int a[]=new int[10];
    void generate_random()
    {   
            Random r1=new Random();
         for (int i = 0; i < 10; i++) {    
            int num=r1.nextInt(100);
            a[i]=num;
            System.out.print(num+" ");
        }
        System.out.println("Random num succesfully generated");
    }

    void write_file() 
    {
        try{
          FileWriter fr=new FileWriter("numbers.txt");
       for (int i = 0; i < a.length; i++) {
          fr.write(a[i]+" "); 
       }
       System.out.println("Write Succesfully");
       fr.close();
       
        }catch(Exception e)
        {
            System.out.println("Error="+e);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        random_num ob=new random_num();

        int ch;
        do {
          System.out.println("\n1-Generate Random number\n2-write within a file\n3-Exit\nEnter Choice=");
           ch=sc.nextInt();
          
          switch (ch) {
            case 1:
                ob.generate_random();                      
                break;
            case 2:
                ob.write_file();
                break;

            default:
                break;
          }
        } while (ch<3);       
    }
}