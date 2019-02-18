import java.util.ArrayList;
import java.util.Arrays;

public class DeckGenerator {

    private ArrayList<String> ranks = new ArrayList<>(Arrays.asList("Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" ));
    private ArrayList<String> suits = new ArrayList<>(Arrays.asList("Clubs", "Spades", "Diamonds", "Hearts"));

    public Deck makeADeck(){
        Deck cardDeck = new Deck();

        for(String suit : suits){
            for(String rank : ranks){

                cardDeck.getDeck().add(new Card(rank, suit));

            }
        }

        return cardDeck;
    }


}
