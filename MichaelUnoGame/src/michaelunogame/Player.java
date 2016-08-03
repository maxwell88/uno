package michaelunogame;

import java.util.ArrayList;
import java.util.Iterator;

public class Player {

    private String id;
    private String name;
    private int valueOfCardsInHand = 0;
    private ArrayList<Card> CardsInHand;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
        CardsInHand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addCardtoHand(Deck c) {
        CardsInHand.add(c.TakeACard());
    }

    public void GetCardsinHand() {
        Iterator<Card> i = CardsInHand.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public int GetCardsinHandValue() {
        Iterator<Card> i = CardsInHand.iterator();
        while (i.hasNext()) {

            valueOfCardsInHand += (i.next().getValue());
        }

        System.out.println(valueOfCardsInHand);
        return valueOfCardsInHand;
    }

    @Override
    public String toString() {
        return ("Player ID: " + id + ", Player Name: " + name);
    }

    public void show() {
        System.out.println(this);
        System.out.println("Cards in Player's Hand:");
        GetCardsinHand();
        System.out.println("");
        System.out.print("Value of Cards in Player's Hand: ");
        GetCardsinHandValue();
        System.out.println("");
        System.out.println("");
    }

    public void removeCardfromHand(Card card) {
        CardsInHand.remove(card);
    }
}
