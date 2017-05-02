package KataTDD.PokerHands;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    
    private App app;
    private String cards;
    
    @Before
    public void setup() {
        app = new App();
        cards = "2S 3S 5S 6S AS";
    }
    
    @After
    public void teardown() {
        app = null;
        cards = "";
    }
    
    @Test
    public void inputFiveCard_return_highCard() {
        String highCard = app.getHighCard(cards);
        assertEquals("AS", highCard);
    }

}
