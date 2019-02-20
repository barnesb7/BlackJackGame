import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GameRulesTest {

    private GameRules gameRules;

    @Before
    public void create(){
        gameRules = new GameRules();
    }



    @Test
    public void checkAllPlayersHandsForTwentyOne() {
        CardHand testPlayerHand = new CardHand();
        ArrayList<Card> playaHand = new ArrayList<>(Arrays.asList(new Card("Ace", "Diamonds")
                , new Card("King", "Spades") ));
        testPlayerHand.setHand(playaHand);
        testPlayerHand.sumCardHand();
        ArrayList<Card> dealerHand = new ArrayList<>(Arrays.asList(new Card("2", "Clubs")
                , new Card("King", "Hears") ));

        CardHand testDealerHand = new CardHand();
        testDealerHand.setHand(dealerHand);
        testDealerHand.sumCardHand();

        Player playa1 = new Player("G-Boomin");
        Dealer dealer1 = new Dealer();
        playa1.setCardHand(testPlayerHand);
        dealer1.setDealerCardHand(testDealerHand);
        String actualStringReturned = gameRules.checkAllPlayersHandsForTwentyOne(playa1, dealer1);

        assertEquals("playaHasTwentyOne", actualStringReturned);

    }

    @Test
    public void checkDealersHandsForTwentyOne() {
        CardHand testPlayerHand = new CardHand();
        ArrayList<Card> playaHand = new ArrayList<>(Arrays.asList(new Card("2", "Diamonds")
                , new Card("King", "Spades") ));
        testPlayerHand.setHand(playaHand);
        testPlayerHand.sumCardHand();
        ArrayList<Card> dealerHand = new ArrayList<>(Arrays.asList(new Card("Ace", "Clubs")
                , new Card("King", "Hears") ));

        CardHand testDealerHand = new CardHand();
        testDealerHand.setHand(dealerHand);
        testDealerHand.sumCardHand();

        Player playa1 = new Player("G-Boomin");
        Dealer dealer1 = new Dealer();
        playa1.setCardHand(testPlayerHand);
        dealer1.setDealerCardHand(testDealerHand);
        String actualStringReturned = gameRules.checkAllPlayersHandsForTwentyOne(playa1, dealer1);

        assertEquals("dealerHasTwentyOne", actualStringReturned);
    }

    @Test
    public void shouldReturnStringWhenBothHaveTwentyONe() {
        CardHand testPlayerHand = new CardHand();
        ArrayList<Card> playaHand = new ArrayList<>(Arrays.asList(new Card("Ace", "Diamonds")
                , new Card("King", "Spades") ));
        testPlayerHand.setHand(playaHand);
        testPlayerHand.sumCardHand();
        ArrayList<Card> dealerHand = new ArrayList<>(Arrays.asList(new Card("Ace", "Clubs")
                , new Card("King", "Hearts") ));

        CardHand testDealerHand = new CardHand();
        testDealerHand.setHand(dealerHand);
        testDealerHand.sumCardHand();

        Player playa1 = new Player("G-Boomin");
        Dealer dealer1 = new Dealer();
        playa1.setCardHand(testPlayerHand);
        dealer1.setDealerCardHand(testDealerHand);
        String actualStringReturned = gameRules.checkAllPlayersHandsForTwentyOne(playa1, dealer1);

        assertEquals("bothPlayersHaveTwentyOne", actualStringReturned);
    }

    @Test
    public void shouldReturnStringWhenNoPlayersHaveTwentyOne() {
        CardHand testPlayerHand = new CardHand();
        ArrayList<Card> playaHand = new ArrayList<>(Arrays.asList(new Card("4", "Diamonds")
                , new Card("King", "Spades") ));
        testPlayerHand.setHand(playaHand);
        testPlayerHand.sumCardHand();
        ArrayList<Card> dealerHand = new ArrayList<>(Arrays.asList(new Card("5", "Clubs")
                , new Card("King", "Hearts") ));

        CardHand testDealerHand = new CardHand();
        testDealerHand.setHand(dealerHand);
        testDealerHand.sumCardHand();

        Player playa1 = new Player("G-Boomin");
        Dealer dealer1 = new Dealer();
        playa1.setCardHand(testPlayerHand);
        dealer1.setDealerCardHand(testDealerHand);
        String actualStringReturned = gameRules.checkAllPlayersHandsForTwentyOne(playa1, dealer1);

        assertEquals("neitherHaveTwentyOne", actualStringReturned);
    }

}