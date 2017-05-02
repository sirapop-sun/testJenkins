package KataTDD.LeapYear;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    
    private App app;

    @Before
    public void setup() {
        app = new App();
    }
    
    @After
    public void teardown() {
        app = null;
    }
    
    @Test
    public void inputLeapYear_ifCanDivisibleByFour_returnTrue() {
        boolean result = app.checkLeapYear(4);
        assertEquals(true, result);
    }
    
    @Test
    public void inputLeapYear_ifCanDivisibleByHundred_returnFalse() {
        boolean result = app.checkLeapYear(100);
        assertEquals(false, result);
    }
    
    @Test
    public void inputLeapYear_ifCanDivisibleByFourHundred_returnTrue() {
        boolean result = app.checkLeapYear(400);
        assertEquals(true, result);
    }
    
    @Test
    public void input1996_ifCanDivisibleByFour_returnTrue() {
        boolean result = app.checkLeapYear(1996);
        assertEquals(true, result);
    }
    
    @Test
    public void inputLeap1900_ifCanDivisibleByHundred_returnFalse() {
        boolean result = app.checkLeapYear(1900);
        assertEquals(false, result);
    }
    
    @Test
    public void inputLeap2000_ifCanDivisibleByFourHundred_returnTrue() {
        boolean result = app.checkLeapYear(2000);
        assertEquals(true, result);
    }
}
