import java.io.*;
class all_method {

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
           else if(f1.canRead())
           {
              System.out.println("File can Readable");
           }
            else if(f1.canWrite())
           {
              System.out.println("File can Write");
           }
           
           System.out.println("File Path="+f1.getPath());
           System.out.println("File Absolute Path="+f1.getAbsolutePath());
           System.out.println("File name="+f1.getName());
           System.out.println("File lengh/size="+f1.length());
           System.out.println("File last modified Time="+f1.lastModified());
        }
        else{
            System.out.println("File/Directory not Found");
        }
        
    }
}

