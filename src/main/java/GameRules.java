public class GameRules {

    private int results;


    //TODO - TEST THIS METHOD
public int checkAllPlayersHandsForWin(Player playa1, Dealer dealer){


    int playa1Total = playa1.getCardHand().getTotalHandSum();
    int dealerTotal = dealer.getDealerCardHand().getTotalHandSum();

    if(checkCardHandForTwentyOne(playa1Total) && playa1Total > dealerTotal) {
        results = 0;
    }
    else if( playa1Total > dealerTotal){
        results = 1;   // playa wins without 21
    } else if (dealerTotal > playa1Total){
            results = 2; // dealer wins
    } else {
           results = 3;
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