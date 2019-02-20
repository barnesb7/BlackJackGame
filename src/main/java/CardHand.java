import java.util.ArrayList;
import java.util.Arrays;

public class CardHand {

    private int totalHandSum;

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


    public void sumCardHand() {

        int cardSum = 0;

        for (Card card : hand) {
            cardSum += getCardNumericalValue(card.getRank());
        }
         setTotalHandSum(cardSum);

    }

    public void adjustHandTotalForAces(){
        int numberOfAcesInHand = getTotalAcesInHand();

        for(int i = 0; i <= numberOfAcesInHand; i++){
            if(getTotalHandSum() > 21){
                setTotalHandSum(getTotalHandSum() - 10);
            }
        }

    }

    private int getTotalAcesInHand(){

        int aceTotal = 0;

        for(Card card: hand){
            if(card.getRank().equalsIgnoreCase("Ace")){
                aceTotal += 1;
            }
        }

        return aceTotal;
    }

        private int getCardNumericalValue(String rank){

            int card = 0;


            if(rank.equalsIgnoreCase("jack")){

                card = 10;

            } else if(rank.equalsIgnoreCase("queen")){
                card =10;

            } else if (rank.equalsIgnoreCase("king")){

                card =10;

            } else if(rank.equalsIgnoreCase("ace")){
                card = 11;
            }
            else {

                card = Integer.parseInt(rank);
            }

            return card;

        }




    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }



    public void addCardToHand(Card card1){
        this.hand.add(card1);
    }

    public int getTotalHandSum() {
        return totalHandSum;
    }

    public void setTotalHandSum(int totalHandSum) {
        this.totalHandSum = totalHandSum;
    }


//    public void sumHandTotalScore(){
//
////        for(Card card: hand){
////            totalScore += Integer.parseInt(card.getRank());
////        }
//
//    }


}
