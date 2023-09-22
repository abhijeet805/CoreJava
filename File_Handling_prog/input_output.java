import java.io.*;

class file
{
    public static void main(String[] args) {
        try {
       FileInputStream f1=new FileInputStream("abc.txt");
       FileOutputStream f2=new FileOutputStream("new.txt");
       
       int k;
       while ((k=f1.read())!=-1) {
          f2.write(k);
       }
       f1.close();

        } catch (Exception e) {
            // TODO: handle exception
          System.out.println("Error="+e);
        }
    }
}