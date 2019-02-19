

public class BlackJackDemo {

    public static void main(String[] args) {
        UserMenuOptions menuOptions = new UserMenuOptions();
        Dealer dealer = new Dealer();
        dealer.shuffleAllDecks();
//
//      for(Deck deck: dealer.getDecks()){
//
//      System.out.println(deck.getDeck());
//      }

        menuOptions.showBadAssAsciiHand();
        String playerName = menuOptions.returnPlayersName();

        Player playa1 = menuOptions.createNewPlayer(playerName);
        double initialBet = menuOptions.askForInitialBet();
        dealer.dealInitialHands(playa1);


        dealer.getDealerCardHand().showDealerHidden2ndCard();
        playa1.getCardHand().showPlayerHand();

    }

}
