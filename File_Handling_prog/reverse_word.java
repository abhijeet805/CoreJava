import java.io.*;
public class reverse_word {
    public static void main(String[] args)throws Exception {
        
    FileReader f1=new FileReader("abc.txt");
    BufferedReader br=new BufferedReader(f1);
    String s1;
    while((s1=br.readLine())!=null)
    {
        String s2[]=s1.split(" ");
        for (int i = 0; i < s2.length; i++) {
          StringBuffer sbr=new StringBuffer(s2[i]);
          System.out.print(sbr.reverse()+" ");     
        }
        System.out.println();
         
    }
    f1.close();
}
}

