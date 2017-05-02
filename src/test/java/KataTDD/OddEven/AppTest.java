package KataTDD.OddEven;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private String checkOneToTwenty;
    private String checkEven;
    private String checkOdd;
    private String checkPrime;
    private App app;
    
    @Before
    public void setup() {
        app = new App();
        checkOneToTwenty = "1234567891011121314151617181920";
        checkEven = "1even3even5even7even9even11even13even15even17even19even";
        checkOdd = "odd2odd4odd6odd8odd10odd12odd14odd16odd18odd20";
        checkPrime = "1primeprime4prime6prime8910prime12prime141516prime18prime20";
    }
    
    @After
    public void teardown() {
        app = null;
        checkOneToTwenty = "";
        checkEven = "";
        checkOdd = "";
        checkPrime = "";
    }
    
    @Test
    public void passString_then_returnOneToTwenty() {
        assertString(checkOneToTwenty, "");
    }
    
    @Test
    public void passEven_then_returnOneToTwenty_andStringEvenInsteadOfNumberEven() {
        assertString(checkEven, "even");
    }
    
    @Test
    public void passOdd_then_returnOneToTwenty_andStringOddInsteadOfNumberOdd() {
        assertString(checkOdd, "odd");        
    }
    
    @Test
    public void passPrime_then_returnOneToTwenty_andStringPrimeInsteadOfNumberPrime() {
        assertString(checkPrime, "prime");
    }
    
    private void assertString(String expect, String check) {
        assertEquals(expect, app.concatenation(check));
    }
    
}
