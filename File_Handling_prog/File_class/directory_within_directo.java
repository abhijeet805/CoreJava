import java.io.File;

public class directory_within_directo {
    public static void main(String[] args)throws Exception {
        File f1=new File("C:\\Users\\poojavetal\\Desktop\\java_program\\File_Handling_prog");
        
        if(f1.exists())
         {
            if(f1.isDirectory())
            {
             String s1[]=f1.list();
             
             System.out.println("Directory=");
             for(int i=0;i<s1.length;i++)
             {
                  File f2=new File(f1,s1[i]);
                  if(f2.isDirectory())
                      System.out.println(s1[i]);
             }

              System.out.println("Files=");
             for(int i=0;i<s1.length;i++)
             {
                  File f2=new File(f1,s1[i]);
                  if(f2.isFile())
                      System.out.println(s1[i]);
             }
         }

         else{
            System.out.println("it is not Directory");
         }
    }
}   
}
