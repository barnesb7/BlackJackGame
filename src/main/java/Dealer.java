import java.util.ArrayList;
import java.util.Collections;

public class Dealer {


    private ArrayList<Deck> decks;
    private CardHand dealerCardHand;

    public Dealer(){
        this.decks = new ArrayList<>();
        DeckGenerator deckGenerator = new DeckGenerator();
        this.decks.add(deckGenerator.makeADeck());
        shuffleAllDecks();
    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }

    public void setDecks(ArrayList<Deck> decks) {
        this.decks = decks;
    }

    //this is allowing us to potentially shuffle all the decks, if we have more than one deck.
    public void shuffleAllDecks(){

        for(Deck d : decks) {

            Collections.shuffle(d.getDeck());

        }
    }

  public Card getCardOnTopOfDeck(){

        Card card = decks.get(0).getDeck().remove(0);

        return card;



  }






    @Override
    public String toString() {
        return "Dealer{" +
                "decks=" + decks +
                '}';
    }
}
