import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class CardHandTest {

    CardHand testCardHand;

    @Before
    public void create(){
       testCardHand = new CardHand();
    }

    @Test
    public void addCardToHand() {

        Card expectedCard = new Card("Queen", "Diamonds");
        testCardHand.addCardToHand(expectedCard);

        String actualCardRank = testCardHand.getHand().get(0).getRank();
        String actualCardSuit = testCardHand.getHand().get(0).getSuit();

       assertEquals("Queen", actualCardRank);

       assertEquals("Diamonds", actualCardSuit);

    }

    @Test
    public void shouldReturnAppropriateCardNumermicalValue(){
        ArrayList<Card> testHand = new ArrayList<>(Arrays.asList(new Card("Ace", "Diamonds"), new Card("5", "Clubs"),
                                                                new Card("Queen", "Hearts")));
        testCardHand.setHand(testHand);

        int expectedSum = 26;
        testCardHand.sumCardHandAccountingForAces();
        int actualSum = testCardHand.getTotalHandSum();

        assertEquals(expectedSum, actualSum);
    }

    //TODO: to check the length of the array in the CardHand class.
}