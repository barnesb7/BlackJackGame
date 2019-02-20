import java.util.ArrayList;
import java.util.Arrays;

public class DeckGenerator {

    private ArrayList<String> ranks = new ArrayList<>(Arrays.asList("2", "3", "4", "5",
            "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" ));
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
