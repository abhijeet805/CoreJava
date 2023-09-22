package Game_Q;

public class outdoor {
    String game;
    int no_of_player;

    public outdoor(String game,int no_of_player)
    {
         this.game=game;
         this.no_of_player=no_of_player;
    }
    public void disp()
    {
        System.out.println("Name of Game="+game);
        System.out.println("Number of Player="+no_of_player);
    }
    
    protected void finallized()
    {
        System.gc();
    }
}
