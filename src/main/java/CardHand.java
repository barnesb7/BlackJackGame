import java.util.ArrayList;
import java.util.Arrays;

public class CardHand {

    private int totalScore;

    private ArrayList<Card> hand;

    public CardHand(){
        this.hand = new ArrayList<>();
    }


    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void addCardToHand(Card card1){
        this.hand.add(card1);
    }

//    public void sumHandTotalScore(){
//
////        for(Card card: hand){
////            totalScore += Integer.parseInt(card.getRank());
////        }
//
//    }


}
