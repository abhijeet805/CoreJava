import java.io.FileInputStream;
import java.io.FileOutputStream;

class demo
{
    public static void main(String[] args)throws Exception
     {
        FileInputStream f1=new FileInputStream("abc.txt");
        FileOutputStream f2=new FileOutputStream("second.txt");
        
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