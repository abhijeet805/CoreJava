import java.io.FileReader;
import java.io.FileWriter;

public class File_Reader {
    public static void main(String[] args)throws Exception
    {
       FileReader f1=new FileReader("abc.txt");
       FileWriter f2=new FileWriter("new1.txt");
       int k;
       while ((k=f1.read())!=-1) 
       {
            f2.write(k);
       }
         f1.close();
         f2.close();   
    }
}
