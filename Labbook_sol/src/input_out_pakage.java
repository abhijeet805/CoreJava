import java.io.DataInputStream;

public class input_out_pakage {
    public static void main(String[] args) throws Exception
    {
        DataInputStream din=new DataInputStream(System.in);
        System.out.println("Enter two numbers:");
        String s1=din.readLine();
        System.out.println("Name"+s1);
    }
}
