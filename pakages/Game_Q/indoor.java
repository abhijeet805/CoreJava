package Game_Q;
public class indoor{
   String game;
   int no_of_player;
    public indoor(String game,int no_of_player1)
    {
         this.game=game;
         no_of_player = no_of_player1;
    }
    public void disp()
    {
        System.out.println("Name of Game="+game);
        System.out.println("Number of Player="+no_of_player);
    }

    protected void finalized()
    {
        System.gc();
    }
}