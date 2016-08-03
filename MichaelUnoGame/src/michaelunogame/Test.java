 
package michaelunogame;

public class Test {

    public static void main(String[] args) {
            
        Player a=new Player("1","Michael");
        Player b=new Player("2","Evan");
        Player c=new Player("3","Amanda");
        Player d=new Player("4","Robert");
        Player e=new Player("5","Adeline");
        
        Game game = new Game("001-03-08-2016");
        game.CreateNewGame(); 
        
        game.addplayer(a);
        game.addplayer(b);
        game.addplayer(c); 
        game.addplayer(d);
        game.addplayer(e);
        
        game.StartGame(); 
        game.showGameInformation();
        
    }
}
