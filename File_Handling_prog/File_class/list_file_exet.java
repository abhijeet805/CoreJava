
import java.io.*;
public class list_file_exet {
    public static void main(String[] args)throws Exception {
        File f1=new File("C:\\Users\\poojavetal\\Desktop\\java_program\\Interface");
        if(f1.exists())
        {
            if(f1.isDirectory())
            {
           String s1[]=f1.list();
           for (int i = 0; i < s1.length; i++) {
              if(s1[i].endsWith(".java"));
                System.out.println(s1[i]);
           }
           }

           else 
            {
                System.out.println("It is not a directory");
            }
        }
    }    
}
