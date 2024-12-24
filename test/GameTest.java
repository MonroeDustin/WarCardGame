package war.cardgame.test;

import war.cardgame.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * JUnit test class for validating the functionality of the Card, Deck, and Player classes.
 */
class GameTest {

    @Test
    void testCardCreation() {
        Card card = new Card(10, "Ten of Hearts");
        assertEquals(10, card.getValue());
        assertEquals("Ten of Hearts", card.getName());
    }

    @Test
    void testDeckShuffleAndDraw() {
        Deck deck = new Deck();
        deck.shuffle();
        Card card = deck.draw();
        assertNotNull(card);
    }

    @Test
    void testPlayerDrawAndFlip() {
        Deck deck = new Deck();
        Player player = new Player("Test Player");
        player.draw(deck);
        assertEquals(1, player.hand.size());

        Card card = player.flip();
        assertNotNull(card);
        assertEquals(0, player.hand.size());
    }

    @Test
    void testScoreIncrement() {
        Player player = new Player("Test Player");
        player.incrementScore();
        assertEquals(1, player.getScore());
    }
}


	