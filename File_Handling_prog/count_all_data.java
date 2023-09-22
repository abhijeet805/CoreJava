import java.io.FileInputStream;

class count
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream f1=new FileInputStream("abc.txt");
        int k,c=0,w=0,l=0,sy=0,d=0;

        while ((k=f1.read())!=-1)
        {
             if(Character.isLetter(k))
                c++;
             else if(Character.isDigit(k))
                d++;
            else if(k=='\n')
               l++;
            else if(k==' ' || k=='\n')
             w++;
             else 
              sy++;
            
        }
        System.out.println("\nCharcter="+c+"\nDigit="+d+"\nLine"+l+"\nWord="+w+"\nSymbol="+sy+"");
        f1.close();
    }
}

