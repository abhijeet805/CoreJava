import java.util.*;
class arr_ope {
    public static void main(String[] args) {
        int i,j,m,n,k,ch;
        
        int a[][]=new int[8][8];
        int b[][]=new int[8][8];
        int c[][]=new int[8][8];

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter rows and column");
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println("Enter First Matrix=");
         for(i=0;i<n;i++){
           for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter Second Matrix=");
         for(i=0;i<n;i++){
           for(j=0;j<m;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        do {
            System.out.println("Enter Choice");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    for(i=0;i<n;i++){
                     for(j=0;j<m;j++)
                        {
                          c[i][j]=a[i][j]+b[i][j];
                        }
                    }                        
                    System.out.println("Addition=");
                    for(i=0;i<n;i++){
                     for(j=0;j<m;j++)
                        {
                         System.out.print(c[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
            
                case 2:
                   for(i=0;i<n;i++){
                     for(j=0;j<m;j++)
                        {
                            c[i][j]=0;
                          for(k=0;k<m;k++)
                          {
                            c[i][j]=c[i][j]+a[i][k]+b[k][j];
                          }
                        }
                    }
                    
                     System.out.println("Multiplication=");
                    for(i=0;i<n;i++){
                     for(j=0;j<m;j++)
                        {
                         System.out.print(c[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
            }
        } while (ch<3);
    }
}
