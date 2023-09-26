import java.io.*;
public class change_content_character_stream {
    public static void main(String[] args)throws Exception {
        FileReader f1=new FileReader("abc.txt");
        FileWriter f2=new FileWriter("second1.txt");
        
        int k;
        while ((k=f1.read())!=-1) {
            if(Character.isUpperCase(k))
              f2.write(Character.toLowerCase(k));
            else if(Character.isLowerCase(k))
              f2.write(Character.toUpperCase(k));
            else if(Character.isDigit(k))
              f2.write('*');
            else
              f2.write(k);
    }
    f1.close();
    f2.close();
    }
}
