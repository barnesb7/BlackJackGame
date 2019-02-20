import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeckGeneratorTest {

    DeckGenerator testDeckGenerator;

    @Before
    public void create(){
        testDeckGenerator = new DeckGenerator();
    }

    @Test
    public void makeADeck() {

        Card expectedFirstCard = new Card("2", "Clubs");

        Deck actualDeckReturned = testDeckGenerator.makeADeck();

        String actualFirstCardRank = actualDeckReturned.getDeck().get(0).getRank();
        String actualFirstCardSuit = actualDeckReturned.getDeck().get(0).getSuit();

       assertEquals(expectedFirstCard.getRank(), actualFirstCardRank);
       assertEquals(expectedFirstCard.getSuit(), actualFirstCardSuit);
    }


    @Test
    public void testsDeckLength(){
        Deck actualDeckReturned = testDeckGenerator.makeADeck();

        assertEquals(52, actualDeckReturned.getDeck().size());
    }
}