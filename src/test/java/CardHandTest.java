import org.junit.Test;

import static org.junit.Assert.*;

public class CardHandTest {

    @Test
    public void addCardToHand() {
        CardHand testCardHand = new CardHand();
        Card expectedCard = new Card("Queen", "Diamonds");
        testCardHand.addCardToHand(expectedCard);

        String actualCardRank = testCardHand.getHand().get(0).getRank();
        String actualCardSuit = testCardHand.getHand().get(0).getSuit();

       assertEquals("Queen", actualCardRank);

       assertEquals("Diamonds", actualCardSuit);

    }

    //TODO: to check the length of the array in the CardHand class.
}