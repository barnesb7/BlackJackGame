import java.util.ArrayList;
import java.util.Arrays;

public class CardHand {

    private int totalScore;

    private ArrayList<Card> hand;

    public CardHand(){
        this.hand = new ArrayList<>();
    }

    public void showDealerHidden2ndCard(){
        System.out.println("----DEALER'S HAND----");
        for(int i = 0; i < hand.size(); i++){
            if(i == 1){
                System.out.println("[Hidden card]");
            }
            else{
                System.out.println(hand.get(i));
            }

        }
        System.out.println(" ");

    }

    public void showPlayerHand(){
        System.out.println("----YOUR HAND----");
        for(Card card : hand){

            System.out.println(card);
        }

        System.out.println( " ");

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
