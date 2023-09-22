import java.util.*;
import Game_Q.indoor;
import Game_Q.outdoor;

public class GMD {
    public static void main(String[] args) {
         int no_of_player;
         String game;
         
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Limit=");
         int n=sc.nextInt();

         indoor ob[]=new indoor[n];
         outdoor ob1[]=new outdoor[n];

         System.out.println("Enter Indoor game info");
         for (int i = 0; i < ob.length; i++) {
            System.out.println("Enter game & no_of_player");
             game=sc.next();
            no_of_player=sc.nextInt();
           ob[i]=new indoor(game,no_of_player);
         }

         System.out.println("Enter outdoor game info");
         for (int i = 0; i < ob1.length; i++) {
            System.out.println("Enter game & no_of_player");
            game=sc.next();
            no_of_player=sc.nextInt();
           ob1[i]=new outdoor(game,no_of_player);
         }

         System.out.println("Indoor Game");
         for (int i = 0; i < ob.length; i++) {
            ob[i].disp();
         }

         System.out.println("outdoor Game");
         for (int i = 0; i < ob1.length; i++) {
            ob1[i].disp();
         }
    }
}
