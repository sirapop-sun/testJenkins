
package KataTDD.Diversion;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private App app;
    private String threeDigits;
    private String fourDigits;

    @Before
    public void setup() {
        app = new App();
        threeDigits = "000,001,010,011,100,101,110,111";
        fourDigits = "0000,0001,0010,0011,0100,0101,0110,0111,1000,1001,1010,1011,1100,1101,1110,1111";
    }
    
    @After
    public void teardown() {
        app = null;
        threeDigits = "";
        fourDigits = "";
    }

    @Test
    public void passThree_checkBinaryForThreeDigits() {
        String[] result = app.makeBinary(3);
        assertEquals(threeDigits, result[0]);
    }
    
    @Test
    public void passThree_checkBinaryThreeDigitsDontAdjacent() {
        String[] result = app.makeBinary(3);
        assertEquals("5", result[1]);
    }
    
    @Test
    public void passFour_checkBinaryForFourDigits() {
        String[] result = app.makeBinary(4);
        assertEquals(fourDigits, result[0]);
    }
    
    @Test
    public void passFour_checkBinaryFourDigitsDontAdjacent() {
        String[] result = app.makeBinary(4);
        assertEquals("8", result[1]);
    }

}
