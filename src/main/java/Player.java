import java.util.ArrayList;

public class Player {

    private String playerName;
    private int moneyInWallet;
    private int amountOfChips;
    private CardHand cardHand;

    public Player(String playerName, int moneyInWallet, int amountOfChips, CardHand cardHand) {
        this.playerName = playerName;
        this.moneyInWallet = moneyInWallet;
        this.amountOfChips = amountOfChips;
        this.cardHand = cardHand;
    }

    public Player(String name, int moneyInWallet){
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getMoneyInWallet() {
        return moneyInWallet;
    }

    public void setMoneyInWallet(int moneyInWallet) {
        this.moneyInWallet = moneyInWallet;
    }

    public int getAmountOfChips() {
        return amountOfChips;
    }

    public void setAmountOfChips(int amountOfChips) {
        this.amountOfChips = amountOfChips;
    }

    public CardHand getCardHand() {
        return cardHand;
    }

    public void setCardHand(CardHand cardHand) {
        this.cardHand = cardHand;
    }
}

