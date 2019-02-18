import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealerTest {

    private Dealer testDealer;

    @Before
    public void create(){
        testDealer = new Dealer();
    }

    @Test
    public void testConstructor(){


        ArrayList<Deck> actualTestDealerDecks = testDealer.getDecks();

        assertEquals(1, actualTestDealerDecks.size());
    }

    @Test
    public void shouldReturnTopCardOnDeck(){

       Card actualCard = testDealer.getCardOnTopOfDeck();
       String actualCardSuit = actualCard.getSuit();
       String actualCardRank = actualCard.getRank();

       assertEquals("Two", actualCardRank);
       assertEquals("Clubs", actualCardSuit);

//        String actualCardSuit2 = testDealer.getCardOnTopOfDeck().getSuit();
//        String actualCardRank2 = testDealer.getCardOnTopOfDeck().getRank();
//
//        assertEquals("Three", actualCardRank2);
//        assertEquals("Clubs", actualCardSuit2);

    }








//    Need to research Mockito to use this to confirm is shuffle function is called
//    @Test
//    public void testShuffleAllDecks(){
//
//        Dealer testDealer = new Dealer();
//    }


}