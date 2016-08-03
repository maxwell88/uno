package michaelunogame;

import java.util.ArrayList;
import java.util.Iterator;

public class Deck {

    private int Number;
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
    }

    public ArrayList<Card> getList() {
        return deck;
    }

    public int getNumber() {
        Number = deck.size();
        return Number;
    }

    public void setValue(int num) {
        Number = num;
    }

    public void AddCard(Card card) {
        deck.add(card);
    }

    public void CreateNewDeck() {
        String x = "";
        String y = "";
        int z = 0;
        String colour[] = {"Red", "Yellow", "Blue", "Green", "Black"};
        String type[] = {"Normal", "Reverse", "Skip", "TakeTwo", "Wild", "WildTakeFour"};
        int value[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 50};


        
//Add 1-9 Normal Cards
        for (int j = 0; j < 4; j++) {
            x = colour[j];
            for (int i = 1; i < 10; i++) {
                y = type[0];
                z = value[i];
                Card cardSet1 = new Card(x, y, z, x + y + z);
                Card cardSet2 = new Card(x, y, z, x + y + z);
                AddCard(cardSet1);
                AddCard(cardSet2);
            }
        }
        
//Add 4 "0" Cards
        for (int i = 0; i < 4; i++) {
            x = colour[i];
            y = type[0];
            z = value[0];
            Card cardSet1 = new Card(x, y, z, x + y + z);
            AddCard(cardSet1);
        }
        
//Add Functional Card
        for (int i = 0; i < 4; i++) {
            x = colour[i];
            for (int j = 1; j < 4; j++) {
                y = type[j];
                z = value[10];
                Card cardSet1 = new Card(x, y, z, x + y + z);
                Card cardSet2 = new Card(x, y, z, x + y + z);
                AddCard(cardSet1);
                AddCard(cardSet2);
            }
        }
        
//Add Wild Card
        for (int i = 4; i < 6; i++) {
            x = colour[4];
            y = type[i];
            z = value[11];
            Card a = new Card(x, y, z, x + y + z);
            Card b = new Card(x, y, z, x + y + z);
            Card c = new Card(x, y, z, x + y + z);
            Card d = new Card(x, y, z, x + y + z);
            AddCard(a);
            AddCard(b);
            AddCard(c);
            AddCard(d);
        }
    }

    public Card TakeACard() {
        int x = (int) (Math.random() * (deck.size() - 1));
        Card card = deck.get(x);
        deck.remove(x);
        return card;
    }

    public void getCard() {
        Iterator<Card> i = deck.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
