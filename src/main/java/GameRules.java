public class GameRules {

public String checkAllPlayersHandsForTwentyOne(Player playa1, Dealer dealer){

    boolean playaHasTwentyOne = checkCardHandForTwentyOne(playa1.getCardHand().getTotalHandSum());
    boolean dealerHasTwentyOne = checkCardHandForTwentyOne(dealer.getDealerCardHand().getTotalHandSum());
    String results = " ";

    if(playaHasTwentyOne && dealerHasTwentyOne){
        results = "bothPlayersHaveTwentyOne";
    } else if (playaHasTwentyOne){
        results = "playaHasTwentyOne";
    } else if (dealerHasTwentyOne){
        results = "dealerHasTwentyOne";
    } else {
        results = "neitherHaveTwentyOne";
    }

    return results;
}


public void dealerDealsOwnHandWhenUnderSeventeen(Dealer dealer){
    dealer.dealOwnHandUnderSeventeen();
}


private boolean checkCardHandForTwentyOne(int handTotal){
    return handTotal == 21;
}



}