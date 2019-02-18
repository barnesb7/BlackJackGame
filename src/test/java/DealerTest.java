import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealerTest {

    @Test
    public void testConstructor(){
        Dealer testDealer = new Dealer();

        ArrayList<Deck> actualTestDealerDecks = testDealer.getDecks();

        assertEquals(1, actualTestDealerDecks.size());
    }

}