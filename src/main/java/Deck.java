import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck (){

        this.deck = new ArrayList<>();

    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
