import java.util.Scanner;

public class BlackJackDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserMenuOptions menuOptions = new UserMenuOptions();
        GameRules gameRules = new GameRules();
        Dealer dealer = new Dealer();
        dealer.shuffleAllDecks();
        boolean continueGame = true;
        String playerName;
        menuOptions.showBadAssAsciiHand();
        playerName = menuOptions.returnPlayersName();

        Player playa1 = menuOptions.createNewPlayer(playerName);
        do {

            System.out.println("[1] To play a hand of black jack");
            System.out.println("[2] Cash out");
            System.out.println("[3] Exit");
            String menuOption = scanner.nextLine();


            switch (menuOption) {
                case "1":

                    double initialBet = menuOptions.askForInitialBet();
                    playa1.setCardHand(new CardHand());
                    dealer.dealInitialHands(playa1);

                    dealer.getDealerCardHand().showDealerHidden2ndCard();
                    playa1.getCardHand().showPlayerHand();

                    playa1.getCardHand().sumCardHandAccountingForAces();
                    dealer.getDealerCardHand().sumCardHandAccountingForAces();

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

                                playa1.getCardHand().sumCardHandAccountingForAces();

                                dealer.getDealerCardHand().showDealerHidden2ndCard();

                                playa1.getCardHand().showPlayerHand();
                                break;
                            case "2":

                                continuePrompt = false;
                                break;
                            case "3":
                                continuePrompt = false;
                                break;
                            default:
                                System.out.println("Not a valid option. Try again");
                                break;

                        }


                    } while (continuePrompt);


                    gameRules.dealerDealsOwnHandWhenUnderSeventeen(dealer);

                    int twentyOneCheck = gameRules.checkAllPlayersHandsForWin(playa1, dealer);

                    int finalPlayaScore = playa1.getCardHand().getTotalHandSum();
                    int finalDealerScore = dealer.getDealerCardHand().getTotalHandSum();

                    if (twentyOneCheck == 0) {

                        System.out.println(playerName+ ", you won with a 21!! ");

                        playa1.getWallet().addWinningsChips((initialBet * 2));
                    } else if (twentyOneCheck == 1) {
                        System.out.println("You won with a " + finalPlayaScore + " to " + finalDealerScore + "!!!");
                        playa1.getWallet().addWinningsChips(initialBet);
                    } else if (twentyOneCheck == 2) {
                        System.out.println("You lost to the dealer: " + finalDealerScore + " to " + finalPlayaScore);
                        playa1.getWallet().subtractChipsFromWalletAfterALoss(initialBet);
                    } else if(twentyOneCheck == 4){
                        System.out.println("You bust! " + finalPlayaScore );
                        playa1.getWallet().subtractChipsFromWalletAfterALoss(initialBet);
                    }
                    else {
                        System.out.println("You tied the dealer: " + finalDealerScore + " to " + finalPlayaScore);
                    }

                    double playa1CashMoney = playa1.getWallet().getCashMoney();
                    int playa1Chips = playa1.getWallet().getChips();

                    System.out.println(playerName + ", your wallet now has " + playa1Chips + " chips and $" + playa1CashMoney);
                    break;

                case "2":

                    System.out.println(playa1.getWallet());
                    System.out.println("Converting" + playa1.getWallet().getChips() + " to cash");
                    playa1.getWallet().addCashMoney(playa1.getWallet().getChips());
                    System.out.println(playa1.getWallet());
                    continueGame = false;
                    break;

                case "3":
                    System.out.println("Thanks for visiting G-Boomin's Black Jack Casino," + playerName);
                    continueGame = false;
                    break;

                default:
                    System.out.println("Choose valid option");
                    break;
            }
        } while (continueGame);


    }


}

