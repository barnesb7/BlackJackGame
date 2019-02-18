import java.util.ArrayList;
import java.util.Arrays;

public class CardHand {

    private int totalScore;

    private ArrayList<Card> hand;

    public CardHand(ArrayList<Card> twoCardsFromDealer){
        this.hand = new ArrayList<>(Arrays.asList(twoCardsFromDealer.get(0), twoCardsFromDealer.get(1)));
    }

//    public void sumHandTotalScore(){
//
////        for(Card card: hand){
////            totalScore += Integer.parseInt(card.getRank());
////        }
//
//    }


}
