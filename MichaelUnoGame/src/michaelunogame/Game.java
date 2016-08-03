 
package michaelunogame;

import java.util.ArrayList;
import java.util.Iterator;

 
public class Game {
    
    private String gameID;
    private ArrayList<Player> playerList;
    private String status;
    private Deck deck;
    private String discardFile;
    private ArrayList<Card> DiscardPile;

    public Game(String gameID) {
        super();
        this.gameID = gameID;
        deck = new Deck();
        playerList = new ArrayList<Player>();
        DiscardPile = new ArrayList<Card>();
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public Deck getdeck() {
        return deck;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiscardFile() {
        return discardFile;
    }

    public void setDiscardFile(String discardFile) {
        this.discardFile = discardFile;
    }

    public void addplayer(Player player) {
        playerList.add(player);
    }

    public void CreateNewGame() {
        getdeck().CreateNewDeck();
    }

    public void StartGame() {
        discardACard(getdeck().TakeACard());
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < playerList.size(); i++) {
                playerList.get(i).addCardtoHand(deck);
            }
        }
    }

    public Card discardACard(Card c) {
        Card card = c;
        DiscardPile.add(card);
        return card;
    }

    public void showDiscardPile() {
        System.out.println("Showing Card on Discard Pile:");
        Iterator<Card> c = DiscardPile.iterator();
        while (c.hasNext()) {
            System.out.println(c.next());
        }
    }

    public void showPlayerList() {
        Iterator<Player> p = playerList.iterator();
        while (p.hasNext()) {
            p.next().show();
        }
    }
    

    public void showGameInformation() {
     
        showDiscardPile();
        System.out.println("");
        System.out.println("Remaining Cards on Deck = " + deck.getNumber());
        System.out.println();
        showPlayerList();
    }


}
