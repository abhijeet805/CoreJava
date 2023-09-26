import java.io.*;
public class Read_Line_rever {
    public static void main(String[] args)throws Exception {
        
    
    FileReader f1=new FileReader("abc.txt");
    BufferedReader br=new BufferedReader(f1);
    String s1;
    while((s1=br.readLine())!=null)
    {
         StringBuffer sbr=new StringBuffer(s1);
         sbr.reverse();
         System.out.print(sbr+"\n");
    }
}
}

