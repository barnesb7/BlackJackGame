import java.util.Scanner;

public class BlackJackDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserMenuOptions menuOptions = new UserMenuOptions();
        GameRules gameRules = new GameRules();
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

        playa1.getCardHand().sumCardHand();
        dealer.getDealerCardHand().sumCardHand();

        System.out.println(dealer.getDealerCardHand().getTotalHandSum());

        //TODO: Clean this up and refactor into a separate method in MenuOptions
        boolean continuePrompt = true;

        do {
            String menuOptionNumber = menuOptions.hitOrStayOption();

            switch (menuOptionNumber) {
                case "1":
                    Card newCard = dealer.getCardOnTopOfDeck();
                    playa1.getCardHand().addCardToHand(newCard);

                    System.out.println("Dealer pulled a " + newCard);

                    playa1.getCardHand().sumCardHand();

                    dealer.getDealerCardHand().showPlayerHand();

                    playa1.getCardHand().showPlayerHand();
                    break;
                case "2":
                    gameRules.dealerDealsOwnHandWhenUnderSeventeen(dealer);
                    continuePrompt = false;
                    break;
                case "3":
                    continuePrompt = false;
                    break;
                default:
                    System.out.println("Not a valid option. Try again");
                    break;

            }


        } while (playa1.getCardHand().getTotalHandSum() < 21 || continuePrompt);


        String twentyOneCheck = gameRules.checkAllPlayersHandsForTwentyOne(playa1, dealer);
        System.out.println("Your hand total" + playa1.getCardHand().getTotalHandSum());
        System.out.println("Dealer hand total " + dealer.getDealerCardHand().getTotalHandSum());

        System.out.println(twentyOneCheck);


    }


}
