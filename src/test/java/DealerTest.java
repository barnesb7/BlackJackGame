import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealerTest {

    private Dealer testDealer;
    private Player playa1;

    @Before
    public void create(){
        testDealer = new Dealer();
        playa1 = new Player("Brian", 1000);
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

    }


    @Test
    public void shouldDealInitialHands(){

        testDealer.dealInitialHands(playa1);

        assertEquals(2, testDealer.getDealerCardHand().getHand().size());
        assertEquals(2, playa1.getCardHand().getHand().size());

    }





//    Need to research Mockito to use this to confirm is shuffle function is called
//    @Test
//    public void testShuffleAllDecks(){
//
//        Dealer testDealer = new Dealer();
//    }


}