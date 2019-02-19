import java.util.ArrayList;

public class Player {

    private String playerName;
    private Wallet wallet;
    private CardHand cardHand;

    public Player(String playerName) {
        this.playerName = playerName;
        this.wallet = new Wallet();
        this.cardHand =  new CardHand();
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public CardHand getCardHand() {
        return cardHand;
    }

    public void setCardHand(CardHand cardHand) {
        this.cardHand = cardHand;
    }
}

