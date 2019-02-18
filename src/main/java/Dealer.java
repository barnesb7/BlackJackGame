import java.util.ArrayList;

public class Dealer {


    private ArrayList<Deck> decks;

    public Dealer(){
        this.decks = new ArrayList<>();
        DeckGenerator deckGenerator = new DeckGenerator();
        this.decks.add(deckGenerator.makeADeck());
    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }

    public void setDecks(ArrayList<Deck> decks) {
        this.decks = decks;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "decks=" + decks +
                '}';
    }
}
