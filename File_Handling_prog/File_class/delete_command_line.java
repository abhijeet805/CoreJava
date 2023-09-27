import java.io.File;

public class delete_command_line {
    public static void main(String[] args)throws Exception {
         for (int i = 0; i < args.length; i++) {
        File f1=new File(args[i]);
         if (f1.exists()) {
             if(args[i].endsWith(".txt"))
              {
                  f1.delete();
                  System.out.println("\n"+args[i]+" File Deleted");
              }
              else
              {
                System.out.println("File Name="+f1.getName());
                System.out.println("File Location="+f1.getPath());
                System.out.println("File Size/length="+f1.length());
              }
         }
      }
    }
}
