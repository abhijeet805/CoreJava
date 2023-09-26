import java.io.*;
public class reverse_file {
    
    public static void main(String[] args)throws Exception {
        
    FileReader f1=new FileReader("abc.txt");
    FileWriter f2=new FileWriter("Rever_file.txt");
    BufferedReader br=new BufferedReader(f1);
    String s1;
    while((s1=br.readLine())!=null)
    {
        String s2[]=s1.split(" ");

        for (int i = 0; i < s2.length; i++) {
            
           s2[i]=s2[i].toUpperCase();
            StringBuffer sbr=new StringBuffer(s2[i]);
         f2.write(sbr.reverse()+" ");     
         
        }
        f2.write("\n");
    }
    f1.close();
    f2.close();
}
}
