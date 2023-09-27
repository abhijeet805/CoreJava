import java.io.*;
class isdir_isfile {

    public static void main(String[] args)throws Exception
    {   
        File f1=new File("C:\\Users\\poojavetal\\Desktop\\java_program\\File_Handling_prog\\abc.txt");
        if(f1.exists())
        {
          System.out.println("File / directory found");
           if(f1.isDirectory())
             System.out.println("It is a directory");
           else if(f1.isFile())
              System.out.println("It is a File");
        }
        else{
            System.out.println("File/Directory not Found");
        }
        
    }
}

