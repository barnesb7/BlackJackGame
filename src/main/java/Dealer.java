import java.util.ArrayList;
import java.util.Collections;

public class Dealer {


    private ArrayList<Deck> decks;
    private DeckGenerator deckGenerator;
    private CardHand dealerCardHand;

    public Dealer(){
        this.decks = new ArrayList<>();
        this.deckGenerator = new DeckGenerator();
        this.decks.add(deckGenerator.makeADeck());
        this.dealerCardHand = new CardHand();

    }

    public DeckGenerator getDeckGenerator() {
        return deckGenerator;
    }

    public CardHand getDealerCardHand() {
        return dealerCardHand;
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

        Card firstCard = decks.get(0).getDeck().remove(0);

//      System.out.println("First card" + firstCard);

        return firstCard;

  }


  public void dealInitialHands(Player playa1){

        for(int i = 0; i < 2; i++){
            dealCardForPlayerHit(playa1);
            dealCardForDealerHit();
        }

  }


  public void dealCardForPlayerHit(Player playa1){
      playa1.getCardHand().addCardToHand(getCardOnTopOfDeck());
  }

  public void dealCardForDealerHit(){
      dealerCardHand.addCardToHand(getCardOnTopOfDeck());
  }



    @Override
    public String toString() {
        return "Dealer{" +
                "decks=" + decks +
                '}';
    }
}
